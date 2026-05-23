package com.example.Pratice2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // ya btata ha kosa class ko access krna ha if two classes have same methods
// implementing the interface
public class Dekstop implements Computer{
    public void compile(){
        System.out.println("Compile in Desktop");
    }
}
