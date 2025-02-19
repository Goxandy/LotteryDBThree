package com.example.expenseTracker;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Budget.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BudgetDao taskDao();
}
