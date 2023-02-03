package com.deloitte.corejava.training.multithreading;

public class MyUserThread2  extends Exception implements Runnable  {
	
	@Override
	public  void run() {
		Thread currentThread = Thread.currentThread();
		for (int i = 1; i <11; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(currentThread.getName()+" executed "+i);
		}
	}
	
	
	public void m1() {
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		MyUserThread2 m1=new MyUserThread2();
		MyUserThread2 m2=new MyUserThread2();
		Thread t1 = new Thread(m1);
		
		t1.setName("Bahubali 1");
		Thread t2 = new Thread(m2,"Bahubali 2");
		t2.wait();
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.start();
		t1.join(5000);
		t2.start();
	}
	
	

}
