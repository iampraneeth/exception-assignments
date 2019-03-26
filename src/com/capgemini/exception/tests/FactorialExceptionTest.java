package com.capgemini.exception.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.custom.exception.FactorialsException;
import com.capgemini.custom.exception.InvalidInputException;
import com.capgemini.exception.main.FactorialException;

public class FactorialExceptionTest {
	private FactorialException factorial;
	
	/*
	 * @Before public void setUp()throws RuntimeException { factorial=new
	 * FactorialException(1); }
	 * 
	 * @Test public void testFactorialNumber() { factorial=new
	 * FactorialException(5); assertEquals(120, factorial.factorialOfNumber()); }
	 * 
	 * @Test(expected=InvalidInputException.class) public void testInvalidInput() {
	 * 
	 * factorial=new FactorialException(1); factorial.factorialOfNumber(); }
	 */
	@Test
	public void testingWithNormalValue() throws InvalidInputException, FactorialsException {
		factorial=new FactorialException(5);
		assertEquals(120,factorial.factorialOfNumber());
		
	}
	@Test(expected=InvalidInputException.class)
	public void testingWithExceptionValue()throws InvalidInputException, FactorialsException{
		factorial=new FactorialException(1);
		factorial.factorialOfNumber();
		
	}
	@Test(expected=FactorialsException.class)
	public void testingWithExceptionValueBigger()throws FactorialsException, InvalidInputException{
		factorial=new FactorialException(18181);
		factorial.factorialOfNumber();
		
	}
}
