package com.deloitte.corejava.training.java8;

public class MyInterfaceTest implements MyInterface{
	
	@Override
	public void m1() {
		System.out.println("M1 method...");
		
	}
	
	public static void main(String[] args) {
		
		MyInterfaceTest mt=new MyInterfaceTest();
		mt.m1();
		mt.m3();
		mt.m4();
		MyInterface.m5();
		MyInterface.m6();
		
	}

}
