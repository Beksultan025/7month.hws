package com.example.data.localdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.data.model.NoteEntity

@Dao
interface NoteDao {

//CRUD

@Insert(onConflict = OnConflictStrategy.REPLACE)
suspend fun createNote(noteEntity: NoteEntity)

@Query("SELECT * FROM notes")
suspend fun getAllNote():List<NoteEntity>

@Update
suspend fun editNote(noteEntity: NoteEntity)

@Delete
suspend fun deleteNote(noteEntity: NoteEntity)

}