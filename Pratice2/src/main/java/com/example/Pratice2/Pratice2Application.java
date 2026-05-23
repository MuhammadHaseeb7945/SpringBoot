package com.example.Pratice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Pratice2Application {

	public static void main(String[] args) {
		// run method object return krta ha or ya ek interface application context ko implement krta ha
		// islia usko as a referal use krta ha or spring boot ka kud ka jo container bnta ha usko access
		// krta ha then us container ka undr koi object ha getbean sa usko access krta ha
		ApplicationContext obj = SpringApplication.run(Pratice2Application.class, args);
        PC lap = obj.getBean(PC.class);
		lap.build();



	}

}
