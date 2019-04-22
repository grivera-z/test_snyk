package com.leszko.calculator;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {
	
	private Calculator calc = new Calculator();

	@Test
	public void testSum() {
		assertEquals(5, calc.sum(2,3));
	}

}
