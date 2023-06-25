package com.myapplication.apringcoredemo.config;

import com.myapplication.apringcoredemo.common.Coach;
import com.myapplication.apringcoredemo.common.swimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class sportConfig {

    @Bean
    public Coach swimCoach(){
        return new swimCoach();
    }
}
