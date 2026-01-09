package com.example.petshop;

import java.util.Date;

public class Sad extends Mood{
    public Sad() {
        super();
    }

    public Sad(Date MoodDate) {
        super(MoodDate);
    }

    @Override
    public String state() {
        return "Sad";
    }
}
