package com.deloitte.corejava.training;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter only one character");
		char grade = sc.next().toUpperCase().charAt(0);
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("Execellent");
			break;

		case 'B':
		case 'C':
			System.out.println("Good");
			break;

		case 'D':
			System.out.println("Pass");
			break;
		case 'E':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invali Grade");
			break;
		}
	}

}
