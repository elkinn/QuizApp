package com.example.nick263.quizapp;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nick263 on 11/9/17.
 */

@Entity
public class Question {
    @PrimaryKey
    public int id;

    @ColumnInfo
    private String topic;

    @ColumnInfo
    private String body;

    @ColumnInfo
    private String lastName;

    @ColumnInfo
    private String jLaw;

    @ColumnInfo
    private String bitcoin;

    @ColumnInfo
    private String scientology;

    @ColumnInfo
    private String amend1;

    @ColumnInfo
    private String himym;

    @ColumnInfo
    private String unami;

    public Question getQuestion(String topic){
        switch (topic){
            case "JLaw":

        }
        return this;
    }
}
