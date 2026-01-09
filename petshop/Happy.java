package com.example.petshop;

import java.util.Date;

public class Happy extends Mood{
    public Happy() {
        super();
    }

    public Happy(Date MoodDate) {
        super(MoodDate);
    }

    @Override
    public String state() {
        return "Happy";
    }



}
