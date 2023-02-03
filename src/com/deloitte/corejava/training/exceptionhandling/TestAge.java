package com.deloitte.corejava.training.exceptionhandling;

import java.util.Scanner;

public class TestAge {
	
	static public void printEligibilityForVote(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Ineligible for vote");
		}else {
			System.out.println("Eligible for Vote");
		}
	}

	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		try {
			printEligibilityForVote(age);
		} catch (InvalidAgeException e) {
			System.out.println("InvalidAgeException occurred due to: "+e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("Finally block  code is executed");
		}
		
		System.out.println("Main method execution is complete");
	}

}
