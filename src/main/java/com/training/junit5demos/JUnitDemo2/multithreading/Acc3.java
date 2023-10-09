package com.training.junit5demos.JUnitDemo2.multithreading;

public class Acc3  implements Runnable{
	Account obj;

	public Acc3(Account obj) {
		super();
		this.obj = obj;
	}

	@Override
	public void run() {
		try {
		obj.withdrawl(3000);
		System.out.println("after withdrawing   3000"+Thread.currentThread().getName());
		
			Thread.sleep(1000);
	        System.out.println(obj.getBalance());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LessFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
