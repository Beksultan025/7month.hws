package com.example.data.mapper

import com.example.data.model.NoteEntity
import com.example.domain.model.Note


fun Note.toEntity() = NoteEntity(
    id,
    title,
    description,
    createAt
)

fun NoteEntity.toNote() = Note(
    id,
    title,
    description,
    createAt
)