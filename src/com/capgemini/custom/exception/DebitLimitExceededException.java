package com.capgemini.custom.exception;

public class DebitLimitExceededException extends RuntimeException {

	public DebitLimitExceededException(String message) {
		super(message);
	}

}
