package com.example.room_e_9406.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.room_e_9406.Model.Todo;

import java.util.List;

@Dao
public interface TodoDao {
    @Query("SELECT * FROM todo")
        List<Todo> getAll();
    @Insert
    Void insertTodo(Todo todo);

    @Update
    void updateTodo(Todo todo);

    @Delete
    void deleteTodo(Todo todo);

}
