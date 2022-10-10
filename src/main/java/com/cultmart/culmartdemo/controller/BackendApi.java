package com.cultmart.culmartdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendApi {

    @GetMapping("/service")
    public String service(){
        return "Service is working";
    }
}
