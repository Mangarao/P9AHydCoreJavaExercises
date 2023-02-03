package com.deloitte.corejava.training.exceptionhandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		System.out.println("Statement 3");
		System.out.println("Statement 4");
		System.out.println("Statement 5");

		try {

			int[] nums = new int[5];
			nums[4] = 10 / 2;
			// throw new RuntimeException("R.T Exception");
			System.exit(0);

		} catch (ArrayIndexOutOfBoundsException ie) {
			System.err.println("Arithemetic exception occurred, due to " + ie.getMessage());
		} catch (Exception e) {
			System.err.println("Exception Occurred: " + e.getMessage());
		} finally {
			System.out.println("Finally block is executed...");
		}

		System.out.println("Statement 6");
		System.out.println("Statement 7");
		System.out.println("Statement 8");
		System.out.println("Statement 9");
		System.out.println("Statement 10");
	}

}
