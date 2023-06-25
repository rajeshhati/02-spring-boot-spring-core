package com.myapplication.apringcoredemo.rest;

import com.myapplication.apringcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    private Coach myCoach;
    private Coach anotherCoach;

    //method name can be setCoach or xyz anything does not matter, it's working because of @Autowired
    @Autowired
    public demoController(@Qualifier("cricketCoach") Coach theCoach,
                          @Qualifier("cricketCoach") Coach theanotherCoach){
        System.out.println("in constructor: "+getClass().getSimpleName());
        myCoach=theCoach;
        anotherCoach=theanotherCoach;
    }

//    @Autowired
//    public demoController(Coach theCoach){
//        myCoach = theCoach;
//    }

    @GetMapping("/workOut")
    public String getDailWorkOut(){
        return myCoach.getDailyWorkOut();
    }

    @GetMapping("/chk")
    public String check(){
        return "comparing beans: "+ (myCoach==anotherCoach);
    }
}
