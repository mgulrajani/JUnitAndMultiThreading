package com.training.junit5demos.JUnitDemo2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreetingSpec {
	
	private Greeting greeting;
	
	@BeforeAll
	public static void befAll() {
		System.out.println("Run once before any test cases of the class is run , it is static ,at class level");
	}
	
	
	@AfterAll
	public static void afterAl() {
		System.out.println("Run once after all test cases of the class is run , it is static ,at class level");
	}

	//A arrange
	
	//we are going to test greet method of the Greeting class , it should return "hello world!"
	
	@BeforeEach
	public void befEach() {
		//Arrange the greeting object
		//here I am allocating the mem
		greeting = new Greeting() ;
		
		
		
	}
	
	
	@AfterEach
	public void aftEach() {
		//we want to deallocate the reference ,release the mem used by greeting object
		greeting = null ;
		
		
	}
	
	
	
	
	
	
	//to proceed with the test, annotate the method as @Test
	@Test
	public void testGreet() {
		//2nd A  is Act
		//3rd A is Assert
		
		//what is the action here
		//we want to test greet method of Greeting class
		//how to call greet method of the Greeting class
		
		String actualResult = greeting.greet();
		
		//3rd Assert 
		//what is the client's requirement  -- greet method when called should return "hello world"
		
		assertEquals("hello world!", actualResult);
				
		
		
		
	}

	//client requirement -- which should accept a name and should return "Have A Good Day , valof var name"

	@Test
	public void testGreetWithAName() {
		
		//act
		String actualResult =greeting.greet("Hemant");
		
		//assert 
		assertEquals("Have A Good Day ,Hemant", actualResult);
		
	}
}
