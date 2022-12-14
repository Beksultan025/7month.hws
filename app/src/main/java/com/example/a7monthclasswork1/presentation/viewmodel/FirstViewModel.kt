package com.example.a7monthclasswork1.presentation.viewmodel

import com.example.domain.model.Note
import com.example.domain.usecase.DeleteNoteUseCase
import com.example.domain.usecase.GetAllNotesUseCase
import com.example.a7monthclasswork1.presentation.utils.UIState
import com.example.a7monthclasswork1.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class FirstViewModel @Inject constructor(
    private val getAllNotesUseCase: GetAllNotesUseCase,
    private val deleteNoteUseCase: DeleteNoteUseCase
) :BaseViewModel() {

    private val _getAllNotesState = MutableStateFlow<UIState<List<Note>>>(UIState.Empty())
    val getAllNotesState = _getAllNotesState.asStateFlow()

    private val _deleteNoteState = MutableStateFlow<UIState<Unit>>(UIState.Empty())
    val deleteNoteState = _deleteNoteState.asStateFlow()


    fun getAllNotes() = getAllNotesUseCase().collectFlow(_getAllNotesState)

    fun deleteNote(note: Note) = deleteNoteUseCase(note).collectFlow(_deleteNoteState)

}