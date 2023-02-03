package com.deloitte.corejava.training.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("abc.txt")) {
			int i;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
