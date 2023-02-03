package com.deloitte.corejava.training;

import java.util.StringTokenizer;

public class StringToknizerExample {
	public static void main(String[] args) {
		String name="My name is MangaRao";
		/*
		 * StringTokenizer st =new StringTokenizer(name, "~"); while(st.hasMoreTokens())
		 * { System.out.println(st.nextToken()); }
		 */
		
		String[] names = name.split(" ");
		for (String string : names) {
			System.out.println(string);
		}
	}

}
