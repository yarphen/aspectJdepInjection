package com.sheremet.aspectj.DepInjection;

public class BugException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7347701674152401756L;
	private static final String MESSAGE = "Some bug is occured, sorry";
	@Override
	public String getMessage() {
		return MESSAGE;
	}
}
