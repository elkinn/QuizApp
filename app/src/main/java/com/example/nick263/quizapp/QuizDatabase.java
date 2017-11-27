package com.example.nick263.quizapp;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by nick263 on 11/20/17.
 */

@Database(entities = {Question.class, Students.class}, version = 1)
public abstract class QuizDatabase extends RoomDatabase{
    private static QuizDatabase INSTANCE;

    public abstract QuizDao userDao();

    public static QuizDatabase getAppDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(), QuizDatabase.class, "user-database")
                            // allow queries on the main thread.
                            // Don't do this on a real app! See PersistenceBasicSample for an example.
                            .allowMainThreadQueries()
                            .build();
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
