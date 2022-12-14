package com.example.data.repository

import com.example.data.base.BaseRepository
import com.example.data.localdb.NoteDao
import com.example.data.mapper.toEntity
import com.example.data.mapper.toNote
import com.example.domain.model.Note
import com.example.domain.repository.NoteRepository
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao
        ): NoteRepository, BaseRepository() {

    //Дата из домейна МОЖЕТ брать что либо

    override fun createNote(note: Note) = doRequest {
        noteDao.createNote(note.toEntity())}

    override fun getAllNotes() = doRequest {
        noteDao.getAllNote().map {it.toNote() } }

    override fun editNote(note: Note) = doRequest  {
        noteDao.editNote(note.toEntity())}

    override fun deleteNote(note: Note) = doRequest {
        noteDao.deleteNote(note.toEntity())}


        }

