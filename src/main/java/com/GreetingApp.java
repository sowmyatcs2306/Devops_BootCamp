package com;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingApp {

	
	 @RequestMapping(path="/message", produces=MediaType.TEXT_PLAIN_VALUE)
	    @ResponseBody
	    public String processForm(@RequestParam(defaultValue="Guest") String name,
	                              @RequestParam(required = false) String value) {
		 
		 System.out.println("value"+value);
		 
		 String greet1="";
		 
		 if (value == null)
		 {
			 greet1="checkiton";
		 }
		 else
	
{
	
	greet1="welcome";
	}

	       
String greet="Hello";
	        return String.format("%s %s %s!", greet, name,greet1);
	    }
}
