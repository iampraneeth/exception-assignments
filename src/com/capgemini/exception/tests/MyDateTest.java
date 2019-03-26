package com.capgemini.exception.tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.capgemini.custom.exception.InvalidDayException;
import com.capgemini.custom.exception.InvalidMonthException;
import com.capgemini.exception.main.MyDate;

public class MyDateTest {

	@Test
	public void testConstructor() {
		MyDate md=new MyDate();
		assertNotNull(md);
	}
	@Test
	public void testParameterConstructor() {
		MyDate md=new MyDate(18,04,1997);
		assertNotNull(md);
	}
	@Test(expected=InvalidDayException.class)
	public void testDay() throws InvalidDayException, InvalidMonthException {
		MyDate md=new MyDate(0,04,1997);
		md.checkDate();
	}
	@Test(expected=InvalidMonthException.class)
	public void testMonth() throws InvalidMonthException, InvalidDayException {
		MyDate md=new MyDate(2,15,1997);
		md.checkDate();
	}
}
