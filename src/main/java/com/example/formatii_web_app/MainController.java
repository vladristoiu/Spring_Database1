package com.example.formatii_web_app;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @GetMapping("")
    public String showHomePage(){
        return "index";
    }
}
