package com.deloitte.corejava.training;

import java.util.Scanner;

public class SumEx {
	
	String n1244ame;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1");
		int num1= sc.nextInt();
		System.out.println("Enter number2");
		int num2=sc.nextInt();
		System.out.println("Sum of two numbers: "+(num1+num2));
		System.out.println("subraction of two numbers: "+(num1-num2));
		System.out.println("Product of two numbers: "+(num1*num2));
		System.out.println("Division of two numbers: "+(num1/num2));
		System.out.println("Modules of two  numbers: "+(num1%num2));
	}

}
