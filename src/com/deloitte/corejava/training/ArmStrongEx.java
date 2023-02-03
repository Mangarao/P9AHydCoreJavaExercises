package com.deloitte.corejava.training;

/**
 * 
 * @author marepalli
 * @since 1/24/2023
 * @version 1.0
 *
 */

public class ArmStrongEx {
	
	
	/**
	 * this method is used to check given input string is Armstrong  or not.
	 * Armstrong is the number which is sum of cubes of each digit equal to same number....
	 * 	 * @param num
	 * @return boolean 
	 */
	static boolean isArmStrong(int num) {
		int temp = num;
		int sum = 0;
		// 153 --> 3 5 1
		//declared remainder field to hold the reminder value
		int remainder = 0;
		while (num >= 1) {
			remainder = num % 10;
			sum = sum + (remainder * remainder * remainder);
			num = num / 10;
		}
		//System.out.println("Sum: " + sum);
		return temp == sum;
	}
	
	/**
	 * This is method to print Armstrong numbers in the given range
	 * @param range
	 */

	static void printArmstrongs(int range) {
		/*
		 * Looping till the given range
		 * For every iteration, calling isArmStrong number to check the index value is Armstrong or not
		 *
		 */
		for (int i = 1; i < range; i++) {
			
			if(isArmStrong(i)) {
				System.out.print(i+"  ");
			}
		}
	}
	
	public static void main(String[] args) {
		String name;
		boolean armStrong = isArmStrong(1634);
		System.out.println("It is Armstrong no. " + armStrong);
		printArmstrongs(1000);
	}

}
