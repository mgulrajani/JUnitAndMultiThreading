package com.training.junit5demos.JUnitDemo2.multithreading;
//unchecked exception -- extends RuntimeException
//checked exception type -extends Exception
public class LessFundsException  extends Exception{
	private String message ;
	private int errorCode;
	public LessFundsException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LessFundsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public LessFundsException(String message, int errorCode) {
		super();
		this.message = message;
		this.errorCode = errorCode;
	}
	
	

}
