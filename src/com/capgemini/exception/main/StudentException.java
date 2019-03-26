package com.capgemini.exception.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.custom.exception.AgeNotWithinRangeException;
import com.capgemini.custom.exception.NameNotValidException;

public class StudentException  {
	private int rollNO;
	private String name;
	private int age;
	private String course;
	public StudentException() {
		
	}
	public StudentException(String name, int age) {
		
	
		this.name = name;
		this.age = age;
		
	}
	public void ageNotBetween() throws AgeNotWithinRangeException {
		if(age>21 || age<15) {
			throw new AgeNotWithinRangeException("msg");
		}
		else {
			System.out.println("Age is okay");
		}
	}
	public void nameInCorrect()throws NameNotValidException {
		Pattern pattern=Pattern.compile("[a-zA-Z]");
		Matcher matcher=pattern.matcher(name);
		if(!matcher.matches()) 
		{
			throw new NameNotValidException();
		}
	}
	

}
