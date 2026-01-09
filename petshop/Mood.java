package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private Date MoodDate;

    public Mood() {
        this.MoodDate = new Date();
    }

    public Mood(Date MoodDate) {
        this.MoodDate = MoodDate;
    }

    public Date getMoodDate() {
        return MoodDate;
    }

    public void setMoodDate(Date moodDate) {
        MoodDate = moodDate;
    }

    public abstract String state();
}
