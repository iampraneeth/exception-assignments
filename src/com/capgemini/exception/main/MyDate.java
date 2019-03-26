package com.capgemini.exception.main;

import com.capgemini.custom.exception.InvalidDayException;
import com.capgemini.custom.exception.InvalidMonthException;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate() {

	}

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void checkDate() throws InvalidDayException, InvalidMonthException {
		if (day > 31 || day < 1) {
			throw new InvalidDayException();

		}
		if (month > 12 || month < 1) {
			throw new InvalidMonthException();
		}
	}

}
