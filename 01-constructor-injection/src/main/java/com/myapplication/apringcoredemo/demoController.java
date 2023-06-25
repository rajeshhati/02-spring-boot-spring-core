package com.myapplication.apringcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    private Coach myCoach;

    @Autowired
    public demoController(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/workOut")
    public String getDailWorkOut(){
        return myCoach.getDailyWorkOut();
    }
}
