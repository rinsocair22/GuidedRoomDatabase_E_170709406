package com.example.room_e_9406.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.room_e_9406.Dao.TodoDao;
import com.example.room_e_9406.Model.Todo;

@Database(entities = {Todo.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TodoDao todoDao();

}
