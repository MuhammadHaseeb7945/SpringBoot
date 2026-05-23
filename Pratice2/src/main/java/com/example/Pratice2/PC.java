package com.example.Pratice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PC {
    @Autowired
    @Qualifier("laptop")
    private Computer c;  // isko field injection kehta ha object spring kud create krta a
    // autowired laptop class ko desktop class sa connect kr rahi ha
//    public Laptop(Dekstop d){// constructor injection
//        this.d=d;
//
//    }

    public void setDekstop(Computer c){ // setter injection
        this.c=c;
    }
    public void build(){

        System.out.println("Build in PC");
        c.compile();

    }
}
