package com.example.knote

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime
import java.util.*

@Entity(tableName = "notes")
data class Note(
    @PrimaryKey(autoGenerate = true)
    var id: Int=0,
    @ColumnInfo(name = "title") var title: String="",
    @ColumnInfo(name = "content") var content: String="",
    @ColumnInfo(name = "date") var date: String=""

)
