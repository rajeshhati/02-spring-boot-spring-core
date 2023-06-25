package com.myapplication.apringcoredemo.common;

public class swimCoach implements Coach{

    public swimCoach(){
        System.out.println("in constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "swim for 1 km";
    }
}
