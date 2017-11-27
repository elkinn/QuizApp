package com.example.nick263.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button himymButton;
    Button jLawButton;
    Button bitcoinButton;
    Button unamiButton;
    Button amend1Button;
    Button scientologyButton;

    String choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        himymButton = (Button)findViewById(R.id.himym);
        himymButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "HIMYM";
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("choice", choice);
                startActivity(intent);
            }
        });
        jLawButton = (Button) findViewById(R.id.jLaw);
        jLawButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "JLaw";
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("choice", choice);
                startActivity(intent);
            }
        });
        bitcoinButton = (Button)findViewById(R.id.bitcoin);
        bitcoinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "Bitcoin";
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("choice", choice);
                startActivity(intent);
            }
        });
        unamiButton = (Button)findViewById(R.id.unami);
        unamiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "Unami";
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("choice", choice);
                startActivity(intent);
            }
        });
        amend1Button = (Button)findViewById(R.id.amend1);
        amend1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "Amendment";
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("choice", choice);
                startActivity(intent);
            }
        });
        scientologyButton = (Button)findViewById(R.id.scientology);
        scientologyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = "Scientology";
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("choice", choice);
                startActivity(intent);
            }
        });

    }
}

