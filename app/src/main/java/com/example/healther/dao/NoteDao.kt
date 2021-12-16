package com.example.healther.dao

import androidx.room.Dao
import androidx.room.Query


@Dao
interface NoteDao {
    @get:Query("SELECT * FROM notes ORDER BY id DESC")
    val allNotes: List<Notes>
}