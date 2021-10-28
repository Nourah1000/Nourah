package com.example.myfirstproject.database.model

import android.accounts.AuthenticatorDescription
import android.widget.CheckBox
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ToDoListModel(
    val task:String,
    val description: String,
    val checkBox: Boolean,

    @PrimaryKey (autoGenerate = true)
    val id : Int=0


)
