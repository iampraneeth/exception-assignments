package com.capgemini.exception.main;

import com.capgemini.custom.exception.FactorialsException;
import com.capgemini.custom.exception.InvalidInputException;;

public class FactorialException {
	private int number;
	private long result = 1;

	public FactorialException(int number) {

		this.number = number;
	}

	public long factorialOfNumber() throws InvalidInputException, FactorialsException {

		if (number <= 2) {
			throw new InvalidInputException("the number");
		}

		for (int i = 1; i <= number; i++) {
			result = result * i;

			if (result > Integer.MAX_VALUE)
				throw new FactorialsException("The number");

		}
		return result;
	}

}
