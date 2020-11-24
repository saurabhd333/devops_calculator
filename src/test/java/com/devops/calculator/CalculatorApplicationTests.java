package com.devops.calculator;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;
import org.junit.Before;

import com.devops.calculator.main.Calculator;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	void contextLoads() {
	}
	
	private Calculator objCalcUnderTest;
	
	@Before 
	public void setUp() { 
		objCalcUnderTest = new Calculator(); 
	}
	
	@Test
	public void testAdd() { 
		int a = 15; 
		int b = 20; 
		int expectedResult = 35; 
		long result = objCalcUnderTest.add(a, b); 
		Assert.assertEquals(expectedResult, result);; 
		
	}
	
	@Test 
	public void testSubtract() { 
		int a = 25; 
		int b = 20; 
		int expectedResult = 5; 
		long result = objCalcUnderTest.subtract(a, b); 
		Assert.assertEquals(expectedResult, result);; 
		
	} 
	

}
