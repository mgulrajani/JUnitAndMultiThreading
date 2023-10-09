package com.training.junit5demos.JUnitDemo2.multithreading;

//MultiTable is Runnable
//so how to make it a Thread
public class MultiTable implements Runnable{
   private int i;
   
	public MultiTable(int i) {
	super();
	this.i = i;
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int j=0;j<=10;j++) {
			System.out.println(this.i*j+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
