package com.myapplication.apringcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class tracCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "run fro 1hr with out rest TRACK coach";
    }
}
