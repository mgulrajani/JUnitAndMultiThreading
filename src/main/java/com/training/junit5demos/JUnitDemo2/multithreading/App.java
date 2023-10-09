package com.training.junit5demos.JUnitDemo2.multithreading;

public class App {
	public static void main(String[] args) {
		 
		Racer r1=new Racer("Max");
		
		Racer r2=new Racer("Piastri");
		Racer r3=new Racer("Perez");
		Racer r4=new Racer("Lando");
		
		/**
		 * 
		 * Thread life cycle 
		 * with the new keyword -- it is a new Thread
		 * with the start method it enters Runnable stage ,means it gains capability to run 
		 * when os scheduler actuallys runs it , means run( )method gets invoked for its share 
		 * of time
		 * and then once its share oftime is over , the thread is moved tothe end of the queue , and next thread in waiting is executed
		 * once it reached the end of run( )  - thread is no longer needed hence it is destroyed
		 * 	 * 
		 * 
		 * 
		 */
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		
		
		
	}
}
