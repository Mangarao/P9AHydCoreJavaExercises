package com.deloitte.corejava.training;

public final class StringInternEx {
	public static void main(String[] args) {
		final String s1 = new String("Welcome").intern();
		final String s2 = s1.intern();
		System.out.println(s1 == s2);
	}

}
