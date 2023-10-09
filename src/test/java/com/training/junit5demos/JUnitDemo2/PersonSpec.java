package com.training.junit5demos.JUnitDemo2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonSpec {

	//@BeforeEach  -- create Person object
	Person p1;
	
	@BeforeEach
	public void befEach() {
		//Arrange
		 p1 =  new Person("heena", "sharma");
		
		
		
	}
	@Test
	public void getFullNameSpec() {
		//test the method
		//action  --- getFullName -store the return value
		//assert compare it with the actual val
		//2nd A is action
		String fullName = p1.getFullName();
		assertEquals("heena sharma", fullName);
		
	}
	
	//client has told that getFullName --method should return - combination of firstName and lastName
	
	//client has asked to throw IllegalArgumentException if fname or lastname is null
	
	
	@Test
	public void testConstructor() {
		IllegalArgumentException thrownObject = 
				assertThrows(IllegalArgumentException.class,()->{
					Person p2 = new Person(null,"sharma");
					
				});
		
		//assertEquals("illegal argument ",thrownObject.getMessage());
		
	}
	
	
	
}
