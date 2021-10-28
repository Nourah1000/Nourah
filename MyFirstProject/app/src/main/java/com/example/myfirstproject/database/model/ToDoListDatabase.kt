package com.example.myfirstproject.database.model

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [ToDoListModel::class],version = 1 )
abstract class ToDoListDatabase:RoomDatabase() {

    abstract fun ToDoListDao(): ToDoListDao
}