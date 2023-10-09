package com.training.junit5demos.JUnitDemo2.multithreading.concurrentcoll;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class Data{
	
	
	CopyOnWriteArrayList<Integer> list ;

	public Data(CopyOnWriteArrayList<Integer> list) {
		super();
		this.list = list;
	}

	@Override
	public String toString() {
		return "Data [list=" + list + "]";
	}
	
	void addData(int a) {
		this.list.add(new Integer(a));
	}
	
	void removeData(int a) {
		for(Integer i:list) {
			
			if(i==a) {
				
				list.remove(new Integer(a));
				break;
				
			}
			
			
		}
		
	}
	
}

class AddRunnable implements Runnable{
	
	Data data;
	
	public AddRunnable(Data data) {
		super();
		this.data = data;
	}



	@Override
	public void run() {
		data.addData(100);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}


class RemoveRunnable implements Runnable{
	
	Data data;
	
	

	public RemoveRunnable(Data data) {
		super();
		this.data = data;
	}



	@Override
	public void run() {
		data.removeData(100);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}



public class ConcurCollDemo {
	
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list=null;
		try {
		List<Integer> list2 =Arrays.asList(1,2,3,4,5);
		
		 list 
		=new CopyOnWriteArrayList<>();
		list.addAllAbsent(list2);
		Data d1=new Data(list);
		
		AddRunnable addRunnable1 =  new AddRunnable(d1);
		AddRunnable addRunnable2 =  new AddRunnable(d1);
		AddRunnable addRunnable3 =  new AddRunnable(d1);
		
		RemoveRunnable removeRunnable1 = new RemoveRunnable(d1);
		RemoveRunnable removeRunnable2= new RemoveRunnable(d1);
		RemoveRunnable removeRunnable3 = new RemoveRunnable(d1);
		
		Thread t1 =new Thread(addRunnable1);
		Thread t2 =new Thread(addRunnable2);
		Thread t3 =new Thread(addRunnable3);
		Thread t4 =new Thread(removeRunnable1);
		Thread t5 =new Thread(removeRunnable2);
		Thread t6 =new Thread(removeRunnable3);
	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}	
		finally {
			System.out.println(list);
		}
		
	}

}
