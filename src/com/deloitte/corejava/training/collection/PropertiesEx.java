package com.deloitte.corejava.training.collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) {
		
		Properties p =new Properties();
		p.setProperty("name", "Manga");
		p.setProperty("age", "34");
		try {
			p.store(new FileWriter("info.properties"), "File generated from Java program");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("file write operation is successful");
		
		
		/*
		 * Properties p = System.getProperties();
		 * 
		 * for (Entry<Object, Object> entry : p.entrySet()) {
		 * System.out.println(entry.getKey() + " = " + entry.getValue());
		 * 
		 * }
		 */
		/*
		 * try { FileReader fr=new FileReader("db.properties"); Properties p =new
		 * Properties(); p.load(fr);
		 * 
		 * System.out.println(p.get("user")); System.out.println(p.get("password"));
		 * System.out.println(p.get("driver")); } catch (FileNotFoundException e) {
		 * System.err.println("File not found"); } catch (IOException e) {
		 * System.err.println("IOException occurred..."); }
		 */
	}

}
