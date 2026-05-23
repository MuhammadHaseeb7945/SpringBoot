package com.example.Pratice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
//    @Autowired
//
//  private Dekstop d;  // isko field injection kehta ha object spring kud create krta a
    // autowired laptop class ko desktop class sa connect kr rahi ha
//    public Laptop(Dekstop d){// constructor injection
//        this.d=d;
//
//    }
//    public void setDekstop(Dekstop d){ // setter injection
//        this.d=d;
//    }
    public void compile(){
        System.out.println("Compile in Laptop");
    }
    public void build(){
        System.out.println("Build in latop");

    }
}
