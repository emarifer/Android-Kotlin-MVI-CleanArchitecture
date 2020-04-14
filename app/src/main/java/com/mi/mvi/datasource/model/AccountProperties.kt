package com.mi.mvi.datasource.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "account")
data class AccountProperties(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "pk")
    var pk : Int,

    @ColumnInfo(name = "email")
    var email : String,

    @ColumnInfo(name = "username")
    var username : String
)