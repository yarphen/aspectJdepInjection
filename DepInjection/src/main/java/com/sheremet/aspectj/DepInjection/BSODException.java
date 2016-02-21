package com.sheremet.aspectj.DepInjection;

public class BSODException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3811324451612957964L;
	private static final String MESSAGE = "this is\r\nBLUE\r\n\tSCREEN\r\n\t\tOF\r\n\t\t\tDEATH";
	@Override
	public String getMessage() {
		return MESSAGE;
	}
}
