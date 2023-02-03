package com.deloitte.corejava.training1;

public class WrapperClassEx {
	
	public static void main(String[] args) {
		Integer i = 10; 
		int ij=i; //auto unboxing
		ij= i.intValue();
		System.out.println(i);
		System.out.println(ij);
		
		/*
		 * int i = 10; Integer ij= i; //auto boxing ij=Integer.valueOf(i);
		 * System.out.println(i); System.out.println(ij);
		 */
		
		
	}

}
