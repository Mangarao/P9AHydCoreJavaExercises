package com.deloitte.corejava.training.multithreading;

public class MyUserThread1 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread is running......");

	}

	public static void main(String[] args) {
		MyUserThread1 m = new MyUserThread1();
		m.start();

	}

}
