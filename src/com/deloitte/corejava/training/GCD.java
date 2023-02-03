package com.deloitte.corejava.training;

public class GCD {

	static int findGCD(int num1, int num2) {
		int gcd = 0;
		int min = num1 < num2 ? num1 : num2;
		for (int i = min; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
				break;
			}
		}

		return gcd;
	}

	public static void main(String[] args) {
		int gcd = findGCD(8, 16);
		System.out.println("GCD is: " + gcd);
	}

}
