package com.deloitte.corejava.training;

public class PalindromeString {

	static boolean isPalindrome(String name) {
		return new StringBuilder(name).reverse().toString().equals(name);

	}

	public static void main(String[] args) {
		boolean palindrome = isPalindrome("MADAM");
		System.out.println(palindrome);
	}

}
