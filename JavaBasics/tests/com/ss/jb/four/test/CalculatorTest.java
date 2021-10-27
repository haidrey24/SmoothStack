package com.ss.jb.four.test;

import static org.junit.Assert.assertNull;

import org.junit.Test;
import com.ss.jb.four.Calculator;

public class CalculatorTest {
	
	Calculator calc = new Calculator();
	
	@Test
	public void addNullTest() {
		assertNull(calc.add(10, null));
		assertNull(calc.add(null, 10));
	}
}
