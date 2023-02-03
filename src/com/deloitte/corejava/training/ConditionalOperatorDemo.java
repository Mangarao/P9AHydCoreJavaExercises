package com.deloitte.corejava.training;

public class ConditionalOperatorDemo {
	
	public static void main(String[] args) {
		int num1=100, num2=20;
		/*
		 * if(num1>num2) { System.out.println("Num1 is big");
		 * 
		 * }else { System.out.println("Num2 is big"); }
		 */
		
		int big = (num1<num2)?num1:num2;
		System.out.println("Smaller number is: "+big);
	}

}
