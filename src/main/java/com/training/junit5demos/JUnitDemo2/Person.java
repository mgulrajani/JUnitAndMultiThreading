package com.training.junit5demos.JUnitDemo2;

public class Person {

	private String firstName;
	private String lastName;
	
	public String getFullName() {
		return this.firstName + " "+ this.lastName;
	}
	
	public Person(String fName,String lName) throws IllegalArgumentException{
		if (fName ==null || lName == null) 
			throw new IllegalArgumentException();
		
		this.firstName=fName;
		this.lastName = lName;
		
	}
}
