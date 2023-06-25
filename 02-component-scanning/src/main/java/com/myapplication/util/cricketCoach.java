package com.myapplication.util;

import org.springframework.stereotype.Component;

@Component
public class cricketCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "run fro 1hr with out rest";
    }
}
