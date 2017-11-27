package com.example.nick263.quizapp;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by nick263 on 11/17/17.
 */

@Dao
public interface QuizDao {
    @Query("SELECT * FROM Question WHERE topic=jLaw")
    List<Question> getJLaw();

    @Query("SELECT * FROM Question WHERE topic=bitcoin")
    List<Question> getBitcoin();

    @Query("SELECT * FROM Question WHERE topic=scientology")
    List<Question> getScientology();

    @Query("SELECT * FROM Question WHERE topic=amend1")
    List<Question> getAmend1();

    @Query("SELECT * FROM Question WHERE topic=himym")
    List<Question> getHIMYM();

    @Query("SELECT * FROM Question WHERE topic=unami")
    List<Question> getUnami();

    @Insert
    void insertAll(List<Question> questions);

    @Update
    void update(Question question);

    @Delete
    void delete(Question question);
}
