package com.training.junit5demos.JUnitDemo2.multithreading;

public class AppForAcc {
public static void main(String[] args) {
	
	
	Account rishi=new Account(11223344,10000);
	
	//Acc2 Runnable is taking rishi 
	Acc2  acc2 =  new Acc2(rishi);
	
	//Acc2 is also working on rishi object
	Acc3 acc3=new Acc3(rishi);
	
	Thread t1 = new Thread(acc2,"acc2");
	
	Thread t2 = new Thread(acc3,"acc3");
	
Thread t3 = new Thread(acc2,"acc2 t3");
	
	Thread t4 = new Thread(acc3,"acc3 t4");
	
	Runnable r1 =()->{
		for(int i=0;i<5;i++) {
		System.out.println("Thread is executing!"+Thread.currentThread().getName());
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}};
	
	new Thread(r1).start();
	
	//after Runnables are created and threads are created
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	
	rishi.getBalance();
	
	
}
}
