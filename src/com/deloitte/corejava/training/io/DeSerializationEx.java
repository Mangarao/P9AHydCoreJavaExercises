package com.deloitte.corejava.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.deloitte.corejava.training.collection.Employee;

public class DeSerializationEx {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("emp.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee emp = (Employee) ois.readObject();
			System.out.println(emp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
