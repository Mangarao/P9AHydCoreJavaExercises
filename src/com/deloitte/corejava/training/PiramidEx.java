package com.deloitte.corejava.training;

public class PiramidEx {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//reverse piramid
		System.out.println("Reverse pattern");
		
		for (int i = 5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
