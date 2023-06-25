package com.myapplication.apringcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class baseBallCoach implements Coach {

    public baseBallCoach(){
        System.out.println("in constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "run fro 1hr with out rest BASE BALL coach";
    }
}
