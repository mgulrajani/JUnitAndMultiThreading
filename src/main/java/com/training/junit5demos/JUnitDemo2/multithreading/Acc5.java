package com.training.junit5demos.JUnitDemo2.multithreading;

public class Acc5  extends Thread{
	
	private Account a1, a2;
	
	
	
	public Acc5(Account a1, Account a2) {
		super();
		this.a1 = a1;
		this.a2 = a2;
	}



	public void run() {
		try {
			//acc5 is obtaining a lock on withdrawl
		a1.withdrawl(5000);
		Thread.sleep(1000);
			a2.deposit(5000);
		} catch (LessFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}