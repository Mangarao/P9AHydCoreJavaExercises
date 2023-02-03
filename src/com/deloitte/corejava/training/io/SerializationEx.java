package com.deloitte.corejava.training.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.deloitte.corejava.training.collection.Employee;

public class SerializationEx {
	public static void main(String[] args) {
		String fileName = "emp.txt";
		File f = new File(fileName);
		try {
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Employee e = new Employee(101, "Manga", 50000);
			oos.writeObject(e);
			System.out.println("Serialization is completed");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
