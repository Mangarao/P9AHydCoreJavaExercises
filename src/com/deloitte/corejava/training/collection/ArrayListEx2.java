package com.deloitte.corejava.training.collection;

import java.util.ArrayList;

public class ArrayListEx2 {
	
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<>();
		ArrayList<String> al2=new ArrayList<>();
		
		al1.add("Manga");
		al1.add("Dhoni");
		al1.add("Kohli");
		
		al2.add("Pandey");
		al2.add("Karthik");
		al2.add("Kohli");
		
		//al1.addAll(al2);
		al1.retainAll(al2);
		
		System.out.println(al1.get(0));
		
		System.out.println("al1: "+al1);
		
	}

}
