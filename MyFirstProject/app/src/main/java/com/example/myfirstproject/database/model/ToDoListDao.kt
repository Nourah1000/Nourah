package com.example.myfirstproject.database.model

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myfirstproject.view.AddTaskFragment


@Dao
interface ToDoListDao {
    @Insert
    suspend fun addTask (toDoListModel: ToDoListModel)

    @Query("SELECT * FROM ToDoListModel")
    fun getTask ():LiveData<List<ToDoListModel>>

    @Update
    suspend fun updateTask (toDoListModel: ToDoListModel)

    @Delete
    suspend fun deleteTask ( toDoListModel: ToDoListModel)
}