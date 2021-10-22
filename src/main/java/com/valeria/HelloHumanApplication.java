package com.valeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	

	 @RequestMapping(value ="/", method = RequestMethod.GET)
	    public String index(@RequestParam(value="name", required=false) String providedName,
	    			        @RequestParam(value="lastname", required=false) String providedLastName){
		 if(providedName == null) {
			return "<h1>Hello human!</h1><h2>Welcome to SpringBoot</h2>"; 
		 }
		 
		 if(providedLastName == null) {
			 return "<h1>Hello " + providedName + "!</h1><h2>Welcome to SpringBoot</h2><a href=\"/\">Go back</a>";
		 }
		 
		 else {
			return "<h1>Hello " + providedName + " " + providedLastName + "!</h1><h2>Welcome to SpringBoot</h2><a href=\"/\">Go back</a>"; 		 
		 }
	}
}
	
