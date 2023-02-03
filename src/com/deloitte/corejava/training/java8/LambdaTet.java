package com.deloitte.corejava.training.java8;

import java.util.function.Predicate;

interface PalindromeInterfacce {
		boolean test(String name);
}

public class LambdaTet {

	public static void main(String[] args) {
		
		PalindromeInterfacce p =	str1 ->  str1.equals(new StringBuffer(str1).reverse().toString());
		System.out.println(p.test("MADAM"));
	}

}
