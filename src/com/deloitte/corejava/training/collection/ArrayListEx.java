package com.deloitte.corejava.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListEx {

	public static void main(String[] args) {
		List<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(101, "Manga", 50000);
		Employee e2 = new Employee(102, "Dhoni", 2000000);
		Employee e3 = new Employee(103, "Kohli", 1500000);

		al.add(e1);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println(al.size());

		Collections.sort(al, new IdComparator());

		for (Employee employee : al) {
			System.out.println(employee);
		}
		
		System.out.println("Sorted element on name");

		Collections.sort(al, new NameComparator());

		for (Employee employee : al) {
			System.out.println(employee);
		}
		/*
		 * ListIterator<Employee> listIterator = al.listIterator();
		 * 
		 * System.out.println("Print the elements in forward direction");
		 * 
		 * while(listIterator.hasNext()) { System.out.println(listIterator.next()); }
		 * 
		 * System.out.println("Print the elements in backward direction");
		 * 
		 * while(listIterator.hasPrevious()) {
		 * System.out.println(listIterator.previous()); }
		 */

		/*
		 * for (String string : al) { System.out.println(string); }
		 */

		// iterator
		/*
		 * Iterator i = al.iterator(); while(i.hasNext()) {
		 * System.out.println(i.next()); }
		 */
	}

}
