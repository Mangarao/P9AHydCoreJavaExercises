package com.deloitte.corejava.training;

public class LCM {
	
	static int findLCM(int num1, int num2) {
		int max = num1>num2?num1:num2;
		int lcm=0;
		while(true) {
			if(max%num1==0 && max%num2==0) {
				lcm=max;
				break;
			}else {
				max++;
			}
		}
		
		return lcm;
	}
	
	public static void main(String[] args) {
		
		int lcm = findLCM(12, 10);
		System.out.println("LCM is: "+lcm);
		
	}

}
