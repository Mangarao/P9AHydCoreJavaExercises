package com.deloitte.corejava.training.java8;

import java.util.function.Function;

public class MethodRefEx {

	static void doSay() {
		System.out.println("hi.....");
	}
	
	public int cube(int n) {
		return n*n*n;
	}

	public static void main(String[] args) {
		
	Function<Integer, Integer>	 f= new MethodRefEx()::cube;
	Integer apply = f.apply(10);
	System.out.println(apply);
	
   Function<Integer, Integer> f1=	num -> num*num*num;
   System.out.println(f1.apply(3));
	
		
	
	}

}
