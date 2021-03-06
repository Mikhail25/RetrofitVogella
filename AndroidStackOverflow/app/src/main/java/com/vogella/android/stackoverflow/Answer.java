package com.vogella.android.stackoverflow;

import com.google.gson.annotations.SerializedName;

public class Answer {

    @SerializedName("answer_id")
    public int answerId;


    @SerializedName("is_accepted")
    public boolean accepted;

    public int score;

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", accepted=" + (accepted?"Yes":"No") +
                ", score=" + score +
                '}';
    }
}


