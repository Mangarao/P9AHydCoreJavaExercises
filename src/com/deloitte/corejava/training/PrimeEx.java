package com.deloitte.corejava.training;

public class PrimeEx {

	static boolean isPrime(int num) {
		// logic goes here
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	static void printPrimes(int range) {

		for (int i = 2; i <= range; i++) {
			if (isPrime(i))
				System.out.print(i + "\s\s");

		}

	}

	public static void main(String[] args) {
		printPrimes(1000);
	}

}
