package com.deloitte.corejava.training.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LinkedListEx  {
	public static void main(String[] args) {
		Set<String> ll=new TreeSet();
		ll.add("Manga");
		ll.add("Manga");
		ll.add("Dhoni");
		ll.add("Kohli");
		ll.add(null);
		
		for (String string : ll) {
			System.out.println(string);
		}
		
	}

}
