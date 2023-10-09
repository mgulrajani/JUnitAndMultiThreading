package com.training.junit5demos.JUnitDemo2.multithreading;
//Racer is a Thread because it extends Thread 

public class Racer extends Thread{
	
	public Racer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void run() {
		
		for(int i=0;i<100;i+=5) {
			
			System.out.println(Thread.currentThread().getName() + i);
			try {
				Thread.sleep(1000);
				
				
			} catch (InterruptedException e) {
			System.out.println("oops!sleep interrupted ");
			}
			
		}
		
		
		
	}
	

}
