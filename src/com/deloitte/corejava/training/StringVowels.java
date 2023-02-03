package com.deloitte.corejava.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringVowels {

	static boolean containsVowelsApproach2(String name) {
		Pattern pattern = Pattern.compile("[aeiouAEIOU]");
		Matcher matcher = pattern.matcher(name);
		return matcher.find();
	}

	static boolean containsVowels(String name) {
		name = name.toUpperCase();
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O'
					|| name.charAt(i) == 'U') {
				return true;
			}

		}

		return false;
	}

	public static void main(String[] args) {

		boolean flag = containsVowelsApproach2("BLCDZY");
		System.out.println("String contains vowels: " + flag);
	}

}
