package com.example.knote

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {
    @Query("SELECT * FROM notes")
    fun getAll(): List<Note>

    @Insert
    fun insert(vararg note: Note)


}