package com.deloitte.corejava.training.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HashMapEx {
	
	public static void main(String[] args) {
		Map<Integer, String> hm=new Hashtable();
		hm.put(104, "Kohli");
		hm.put(101,"Manga");
		hm.put(102, "Dhoni");
		hm.put(101, "Manga Rao");
		hm.put(null, null);
		
		System.out.println(hm);
		
		for (Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
