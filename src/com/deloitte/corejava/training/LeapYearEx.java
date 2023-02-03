package com.deloitte.corejava.training;

public class LeapYearEx {
	
	static boolean isLeapYear(int year) {
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			return true;
		}
		
		return false;
	}
	
	static void printLeapYears(int start, int end) {
		for (int i = start; i <=end; i++) {
			if(isLeapYear(i))
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		boolean leapYear = isLeapYear(1900);
		System.out.println("It is  leapyear: "+leapYear);
		printLeapYears(2000,2100);
		
	}

}
