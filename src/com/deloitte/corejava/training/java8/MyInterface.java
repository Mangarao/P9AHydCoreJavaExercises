package com.deloitte.corejava.training.java8;

@FunctionalInterface
public interface MyInterface {

	void m1();
	

	default void m3() {
		System.out.println("hello");
	}

	default void m4() {
		System.out.println("m4 method");
	}
	
	static void m5() {
		System.out.println("m5");
	}
	
	static void m6() {
		System.out.println("m6");
	}
}
