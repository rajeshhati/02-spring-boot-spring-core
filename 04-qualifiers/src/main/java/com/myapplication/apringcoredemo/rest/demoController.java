package com.myapplication.apringcoredemo.rest;

import com.myapplication.apringcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    private Coach myCoach;

    //method name can be setCoach or xyz anything does not matter, it's working because of @Autowired
    @Autowired
    public demoController(@Qualifier("cricketCoach") Coach theCoach){
        myCoach=theCoach;
    }

//    @Autowired
//    public demoController(Coach theCoach){
//        myCoach = theCoach;
//    }

    @GetMapping("/workOut")
    public String getDailWorkOut(){
        return myCoach.getDailyWorkOut();
    }
}
