package com.myapplication.apringcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class tracCoach implements Coach {

    public tracCoach(){
        System.out.println("in constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "run fro 1hr with out rest TRACK coach";
    }
}
