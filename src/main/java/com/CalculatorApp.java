package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorApp {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "HelloWorld";
	}

}
