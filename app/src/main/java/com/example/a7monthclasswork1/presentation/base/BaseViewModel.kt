package com.example.a7monthclasswork1.presentation.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.utils.Resource
import com.example.a7monthclasswork1.presentation.utils.UIState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

abstract class BaseViewModel:ViewModel() {

    protected fun <T> MutableStateFlow<UIState<T>>.createState(text:String, text2:String){
        val text = MutableStateFlow<UIState<T>>(UIState.Empty())
        val text2 = text.asStateFlow()
    }

    protected fun <T> Flow<Resource<T>>.collectFlow(_state:MutableStateFlow<UIState<T>>){
         viewModelScope.launch(Dispatchers.IO) {
            this@collectFlow.collect{ result->
                when (result){
                    is Resource.Loading->{
                        _state.value = UIState.Loading()
                    }
                    is Resource.Error->{
                        _state.value = UIState.Error(result.message!!)
                    }
                    is Resource.Success ->{
                        if (result.data != null){
                            _state.value = UIState.Success(result.data!!) }
                    }
                }

            }
        }
    }

}