package com.deloitte.corejava.training;

public class BiggerEx {
	
	public static void main(String[] args) {
		int num1=10,num2=20, num3=15;
		if (num1>num2 && num1>num3) {
			System.out.println("Num1 is big");
		} else if(num2>num3) {
			System.out.println("Num2 is big");
		}else {
			System.out.println("Num3 is big");
		}
	}

}
