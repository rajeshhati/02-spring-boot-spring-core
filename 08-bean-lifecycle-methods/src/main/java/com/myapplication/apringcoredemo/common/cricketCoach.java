package com.myapplication.apringcoredemo.common;

import com.myapplication.apringcoredemo.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class cricketCoach implements Coach {

    public cricketCoach(){
        System.out.println("in constructor: "+getClass().getSimpleName());
    }

    @PostConstruct
    public void doMyStartupMethod(){
        System.out.println("inside my init method: " +getClass().getSimpleName());
    }
    @PreDestroy
    public void doMyCleanupMethod(){
        System.out.println("inside my destroy method: " +getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "run fro 1hr with out rest CRICKET coach";
    }
}
