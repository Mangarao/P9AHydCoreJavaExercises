package com.deloitte.corejava.training;

public class ForEachEx {
	public static void main(String[] args) {
		
		String[] names= {"Manga","Dhoni","Kohli"};
		int[] nums= {10,20,30,40,50};
		/*
		 * for (int i = 0; i < names.length; i++) { System.out.println(names[i]);
		 * 
		 * }
		 */
		for (int num : nums) {
			if(num==30 || num==40) {
				continue;
			}
			System.out.println(num);
		}
		
		System.out.println("Program execution ends");
	}

}
