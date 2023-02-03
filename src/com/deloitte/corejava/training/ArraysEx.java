package com.deloitte.corejava.training;

import java.util.Arrays;

public class ArraysEx {
	
	public static void main(String[] args) {
		int[] nums = new int[4];
		nums[0]=20;
		nums[1]=30;
		nums[2]=10;
		nums[3]=5;
		Arrays.sort(nums);
		for (int i : nums) {
			System.out.println(i);
		}
		/*
		 * for (int i = 0; i < nums.length; i++) { System.out.println(nums[i]); }
		 */
	}

}
