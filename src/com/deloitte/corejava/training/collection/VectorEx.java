package com.deloitte.corejava.training.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	
	public static void main(String[] args) {
		Vector<String> v=new Vector();
		v.add("Manga");
		v.add("Dhoni");
		
		Enumeration<String> elements = v.elements();
		
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
	}

}
