package com.training.junit5demos.JUnitDemo2.multithreading;

public class Acc4  extends Thread{
	
	private Account a1, a2;
	
	
	
	public Acc4(Account a1, Account a2) {
		super();
		this.a1 = a1;
		this.a2 = a2;
	}



	public void run() {
		//acc4 is obtaining a lock on deposit method 
		a2.deposit(5000);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			a1.withdrawl(5000);
			
		} catch (LessFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
