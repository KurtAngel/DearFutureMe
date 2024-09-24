package com.example.roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_acc")
data class User(
    @PrimaryKey(autoGenerate = true) val pId : Int,
    @ColumnInfo("Username")val username : String,
    @ColumnInfo("Password")val password : String
)
