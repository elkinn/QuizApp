package com.example.nick263.quizapp;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class QuizActivity extends AppCompatActivity {
    String choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Bundle choices = getIntent().getExtras();
        if(choices != null){
            choice = choices.getString("choice");
        }
        QuizDatabase database = Room.databaseBuilder(getApplicationContext(), QuizDatabase.class, "QUIZ_DB")
                .allowMainThreadQueries().build();
    }
}
