package com.capgemini.exception.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.custom.exception.AgeNotWithinRangeException;
import com.capgemini.custom.exception.NameNotValidException;
import com.capgemini.exception.main.StudentException;

public class StudentExceptionTest {

	@Test
	public void testParameterisedConstructor() {
		StudentException se=new StudentException("Ram",21);
		assertNotNull(se);
		
	}
	@Test
	public void testDefaultConstructor() {
		StudentException se=new StudentException();
		assertNotNull(se);
	}
	@Test(expected=AgeNotWithinRangeException.class)
	public void testWithInRange() throws AgeNotWithinRangeException
	{
		StudentException se=new StudentException("Ram",23);
		se.ageNotBetween();
		
	}
	
	@Test(expected=NameNotValidException.class)
	public void testNameIncorrect() throws NameNotValidException
	{
		StudentException se=new StudentException("Ram@1804",23);
		se.nameInCorrect();
		
	}
	

}
