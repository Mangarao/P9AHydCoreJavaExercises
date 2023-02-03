package com.deloitte.corejava.training;

public class CommandLineEx {
	
	

	public static void main(String... xyz) {
		System.out.println("Length of the command line arugment is: "+xyz.length);
		for (String string : xyz) {
			System.out.println(string);
		}

		
	}

}
