package com.example.domain.repository

import com.example.domain.model.Note
import com.example.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

//Репозитори в Домейн должен быть пустым, так как реализация происходит в Дата

    fun createNote(note : Note) : Flow<Resource<Unit>>
    fun getAllNotes(): Flow<Resource<List<Note>>>
    fun editNote (note : Note) : Flow<Resource<Unit>>
    fun deleteNote(note : Note): Flow<Resource<Unit>>

}