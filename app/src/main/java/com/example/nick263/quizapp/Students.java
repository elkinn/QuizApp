package com.example.nick263.quizapp;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nick263 on 11/14/17.
 */

@Entity
public class Students {
    @PrimaryKey
    public int osis;

    @ColumnInfo
    private String firstName;

    @ColumnInfo
    private String lastName;

    @ColumnInfo
    private int jLawScore;

    @ColumnInfo
    private int bitcoinScore;

    @ColumnInfo
    private int scientologyScore;

    @ColumnInfo
    private int amend1Score;

    @ColumnInfo
    private int himymScore;

    @ColumnInfo
    private int unamiScore;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getOSIS(){
        return osis;
    }
    public HashMap<String, Integer> getScores(){
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("jLaw", jLawScore);
        scores.put("bitcoin", bitcoinScore);
        scores.put("scientology", scientologyScore);
        scores.put("amend1", amend1Score);
        scores.put("himym", himymScore);
        scores.put("unami", unamiScore);
        return scores;
    }

}
