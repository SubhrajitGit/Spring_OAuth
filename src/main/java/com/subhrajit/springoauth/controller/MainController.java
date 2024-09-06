package com.subhrajit.springoauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "Home Page";
    }
    @RequestMapping("/alldata")
    public String alldata() {
        return "All Data";
    }
}
