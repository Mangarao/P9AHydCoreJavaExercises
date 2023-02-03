package com.deloitte.corejava.training.collection;

@FunctionalInterface
interface Greeter {
	void greet();
	
}

public class Greeting {

	public static void main(String[] args) {

		Greeter g1 = () -> System.out.println("Hello, world");

		g1.greet();
		
		Greeter g2 = () -> System.out.println("Hello, Deloitte");

		g1.greet();

	

		
	}

}
