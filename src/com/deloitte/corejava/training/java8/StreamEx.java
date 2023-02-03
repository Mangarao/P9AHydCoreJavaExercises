package com.deloitte.corejava.training.java8;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamEx {

	public static void main(String[] args) {
		
		String name="Manga";
		
		Optional<String> optional = Optional.ofNullable(name);
		if(optional.isPresent()) {
			System.out.println("No value");
		}else {
			System.out.println("length "+optional.get().length());
		}
		
		
		String[] names = new String[3];
		
		Optional<String> optionalObj = Optional.ofNullable(names[1]);
		optionalObj.ifPresentOrElse(System.out::println, () -> System.out.println("No value present"));
		
		/*
		 * if(name!=null) { System.out.println(name.length()); }else {
		 * System.out.println("Name is not initialized"); }
		 */
		
		Arrays.asList(1,2,3,4,5).parallelStream().mapToInt(Integer::valueOf).sum();
		
		 IntStream.range(1, 100).parallel().sum();
		
			//1, 2, 3 ==> 1*2*3

		Optional<Integer> prod = Arrays.asList(1, 2, 3,4).stream().reduce((num1, num2) -> num1 + num2);
		System.out.println("Product is: " + prod);

		// Flat maps converts list of collection objects into singl ecollection

		/*
		 * List<Integer> collect = Arrays.asList(Arrays.asList(1, 2, 3),
		 * Arrays.asList(4, 5)).stream() .flatMap(list ->
		 * list.stream()).collect(Collectors.toList());
		 * 
		 * collect.stream().forEach(n -> System.out.println(n));
		 */
		/*
		 * OptionalDouble sum = IntStream.range(1,5).average(); System.out.println(sum);
		 */

		/*
		 * Stream.of("Manga", "Dhoni","Kohli","Dinesh"). filter(name ->
		 * name.startsWith("D")). sorted().forEach(name -> System.out.println(name));
		 * 
		 * //1,2,3,4 //1*10, 2*10, 3*10, 4*10 //10, 20, 30, 40 //Sum --> 100
		 * 
		 * int sum = IntStream.range(1, 5). map(num->num).sum();
		 * 
		 * System.out.println(sum);
		 */

	}
}
