package com.example.healther

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


data class MedicalHistory(
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "sub_title")
    var subtitle: String,

    @ColumnInfo(name = "date_time")
    var dateTime: String,

    @ColumnInfo(name = "note_text")
    var noteText: String,

    @ColumnInfo(name = "color")
    var color: String
){
    override fun toString(): String {

        return "$title : $dateTime"
    }
}
