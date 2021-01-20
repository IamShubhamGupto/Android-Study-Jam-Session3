package com.example.studyjamsession3.pathway7.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class Note(
    @PrimaryKey(autoGenerate = true)
    var noteid: Long = 0L,

    @ColumnInfo(name = "note_data")
    val notes: String? = null

)
