package com.devops.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devops.calculator.main.Calculator;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
		
		Calculator cal = new Calculator();
		
		System.out.println("ADDITION of 10 , 20 is --- " +cal.add(10, 20));
		
		System.out.println("SUBSTRACTION of 50 , 10 is ---" +cal.subtract(50,10));
		
		System.out.println("Changes added....");
		
	}

}
