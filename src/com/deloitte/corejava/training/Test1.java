package com.deloitte.corejava.training;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		//classname reference_variable_name=new classname();
		Scanner  s=new Scanner(System.in);
		System.out.println("Enter your name...");
		String name=s.nextLine();
		System.out.println("Hello, "+name+" Welcome to Java Programming");
		s.close();
		
	}

}
