package com.example.a7monthclasswork1.presentation.viewmodel

import com.example.domain.model.Note
import com.example.domain.usecase.CreateNoteUseCase
import com.example.domain.usecase.EditNoteUseCase
import com.example.a7monthclasswork1.presentation.utils.UIState
import com.example.a7monthclasswork1.presentation.base.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class SecondViewModel @Inject constructor(
    private val createNoteUseCase: CreateNoteUseCase,
    private val editNoteUseCase: EditNoteUseCase
) :BaseViewModel() {
    private val _createNoteState = MutableStateFlow<UIState<Unit>>(UIState.Empty())
    val createNoteState = _createNoteState.asStateFlow()

    private val _editNoteState = MutableStateFlow<UIState<Unit>>(UIState.Empty())
    val editNoteState = _editNoteState.asStateFlow()





    fun createNote(note: Note) = createNoteUseCase(note).collectFlow(_createNoteState)

    fun editNote(note: Note) = editNoteUseCase(note).collectFlow(_editNoteState)


}