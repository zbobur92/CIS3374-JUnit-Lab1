package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setUp(){
		calculator = new Calculator();
	}
	
	@Test
	public void addTest() {
		assertEquals(4, calculator.add(2, 2));
	}
	@Test
	public void subtractTest(){
		assertEquals(0, calculator.subtract(2, 2));
	}
	@Test
	public void multiplyTest(){
		assertEquals(4, calculator.multiply(4, 1));
	}
	@Test
	public void divideTest(){
		assertEquals(4, calculator.divide(4, 1));
	}
	@Test
	public void assertTrueMethod(){
		assertTrue(calculator.isEqual(4, 4));
	}
	@Test
	public void assertFalseMethod(){
		assertFalse(calculator.isEqual(4, 0));
	}

}
