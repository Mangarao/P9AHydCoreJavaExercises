package com.deloitte.corejava.training;

public class Reverse {

	static int reverseNumber(int num) {
		int reverse = 0;
		while (num >= 1) {
			reverse = reverse * 10 + (num % 10);
			num = num / 10;
		}

		return reverse;
	}
	
	static boolean isPalindrome(int num) {
		return num==reverseNumber(num);
	}

	public static void main(String[] args) {
		boolean palindrome = isPalindrome(32123);
		System.out.println("It is palindrome: "+palindrome);
		
		/*
		 * int reverseNumber = reverseNumber(123);
		 * System.out.println("reverse of the given number is: " + reverseNumber);
		 */
	}

}
