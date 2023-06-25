package com.myapplication.apringcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class tennisCoach implements Coach {

    public tennisCoach(){
        System.out.println("in constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "run fro 1hr with out rest TENNIS coach";
    }
}
