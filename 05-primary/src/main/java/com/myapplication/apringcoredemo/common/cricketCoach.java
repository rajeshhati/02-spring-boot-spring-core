package com.myapplication.apringcoredemo.common;

import com.myapplication.apringcoredemo.common.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class cricketCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "run fro 1hr with out rest CRICKET coach";
    }
}
