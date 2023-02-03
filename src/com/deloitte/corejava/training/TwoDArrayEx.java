package com.deloitte.corejava.training;

public class TwoDArrayEx {

	public static void main(String[] args) {
		int[][] nums= {{10,20,30},{40,50,60}};
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				System.out.print(nums[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
