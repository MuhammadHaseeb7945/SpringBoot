package com.example.WebSpring.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {
    @RequestMapping("/")
    public String getHome(){
        return "Welcome to Haseeb Learning";
    }

}
