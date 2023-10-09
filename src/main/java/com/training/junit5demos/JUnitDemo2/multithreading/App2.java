package com.training.junit5demos.JUnitDemo2.multithreading;

public class App2 {
public static void main(String[] args) {
	
	//declared 4 Runnables
	
	MultiTable multiTableRunnable =  new MultiTable(5);
	
	MultiTable multiTableRunnable2 =  new MultiTable(7);
	
	MultiTable multiTableRunnable3 =  new MultiTable(9);
	
	MultiTable multiTableRunnable4 =  new MultiTable(19);
	
	
	//Passed them to the Thread object as firstparameter 
	//String name of the thread is the second parameter of Thread constructor
	
	Thread t1 = new Thread(multiTableRunnable, "Table of 5");
	
	Thread t2 = new Thread(multiTableRunnable2, "Table of 7");
	
	Thread t3 = new Thread(multiTableRunnable3, "Table of 9");
	
	Thread t4 = new Thread(multiTableRunnable4, "Table of 19");
	
	t1.start();

	
	
	try {
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();

	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
