package com;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorApp {
	// new addition to master
	
	@GetMapping ("/hello")
	public String sayHi() {
		return "Hello!!!";
	}
	
	
	@GetMapping ("/division")
	public int division (Parameters params) {
		
		int a= params.getA();
		int b= params.getB();
		return (a/b);
	}
	
	@GetMapping ("/multiply")
	public int multiply (Parameters params) {
		int a= params.getA();
		int b= params.getB();
		return (a*b);
		
	}

		
	@GetMapping("/getParam")
	public int parametertest(@RequestParam(value = "num", defaultValue = "1") int num) {
		return num;
	}
	
	
		@GetMapping("/random")
	
	public int counterValue() {
        Random rand = new Random(); 
        int rand_no = rand.nextInt(1000);
		return rand_no;
	}
}
