package com.training.junit5demos.JUnitDemo2.multithreading;

public class Acc2 implements Runnable {
	
	Account obj;

	public Acc2(Account obj) {
		super();
		this.obj = obj;
	}

	@Override
	public void run() {
		
		obj.deposit(1000);
		System.out.println("after depositing  1000"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
	        System.out.println(obj.getBalance());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
