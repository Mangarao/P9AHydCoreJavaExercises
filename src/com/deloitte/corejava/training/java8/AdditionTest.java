package com.deloitte.corejava.training.java8;

import java.util.function.BiFunction;

interface MyBiFunction {

	int add(int num1, int num2);
}

public class AdditionTest {

	public static void main(String[] args) {

		BiFunction<Integer, Integer[], Integer> a = (num1, num2) -> {
			int sum=0;
			for (Integer i : num2) {
				sum+=i;
			}
			return sum+num1;
		};

		long add = a.apply(10, new Integer[] {10,20});
		System.out.println(add);

		MyBiFunction mb = (num1, num2) ->  num1 +num2 ;
		System.out.println(mb.add(20, 30));

	}

}
