package com.myapplication.apringcoredemo.common;

import com.myapplication.apringcoredemo.common.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class cricketCoach implements Coach {

    public cricketCoach(){
        System.out.println("in constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "run fro 1hr with out rest CRICKET coach";
    }
}
