package com.deloitte.corejava.training;

public class SwapEx {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Before swapping");
		System.out.println("a=" + a + " b=" + b);
		// logic to be placed to swap no.s
		// with using third variable
		/*
		 * int temp = a; a = b; b = temp;
		 */
		// without using third variable
		b = (a + b) - (a = b);

		System.out.println("After swapping");
		System.out.println("a=" + a + " b=" + b);
	}

}
