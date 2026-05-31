package com.example.WebSpring.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutUs {
    @RequestMapping("/about")
    public String  getAbout(){
        return "we are oldest and top tier company in the world";
    }

}
