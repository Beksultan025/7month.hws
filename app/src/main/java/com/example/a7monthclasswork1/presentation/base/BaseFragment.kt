package com.example.a7monthclasswork1.presentation.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import com.example.a7monthclasswork1.presentation.utils.UIState
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch

abstract class BaseFragment(@LayoutRes layoutId:Int) : Fragment(layoutId) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initialize()
        setupClickListeners()
        setupObservers()
        setupRequests()
    }

    protected open fun initialize(){}
    protected open fun setupClickListeners(){}
    protected open fun setupObservers(){}
    protected open fun setupRequests(){}


    protected fun <T> StateFlow<UIState<T>>.collectState(
        onLoading: () -> Unit,
        onError: (message: String) -> Unit,
        onSuccess: (data: T) -> Unit
    ) {
        viewLifecycleOwner.lifecycleScope.launch {
            this@collectState.flowWithLifecycle(
                viewLifecycleOwner.lifecycle, androidx.lifecycle.Lifecycle.State.STARTED
            ).distinctUntilChanged().collect() { state ->
                when (state) {
                    is UIState.Loading -> {
                        onLoading
                    }
                    is UIState.Error -> {
                        onError(state.message)
                    }
                    is UIState.Success -> {
                        onSuccess(state.data)
                    }
                    is UIState.Empty -> {}
                }
            }
        }
    }

}
