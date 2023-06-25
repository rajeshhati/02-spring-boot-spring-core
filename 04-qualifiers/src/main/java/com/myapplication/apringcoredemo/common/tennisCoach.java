package com.myapplication.apringcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class tennisCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "run fro 1hr with out rest TENNIS coach";
    }
}
