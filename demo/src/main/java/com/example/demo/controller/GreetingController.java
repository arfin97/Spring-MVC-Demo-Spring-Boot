package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String getGreetings(Map<String, Object> model){
        model.put("message", "arfin");
        return "greetings";
    }
}
