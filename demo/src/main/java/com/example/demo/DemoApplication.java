package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// run ek object return krta ha or ya applicationcontext interface ko extend kr rha hotaha
// 	is lia agr hum reference ApplicationContext ka use krain or then usma jo object return ho rah hota ha usko save kr lian
// to get bean sa us class ko acccess kr skta ha
// spring boot ka kam ha ka wo jo container bnta ha
//usma autmoaticlly class ka object bnana without manual object bnana ka
// @component annonation btati ha ka iska object bnoo
// kuka wo kud sa object ni bnata
		ApplicationContext obj= SpringApplication.run(DemoApplication.class, args);
        obj.getBean(Calc.class);

	}

}
