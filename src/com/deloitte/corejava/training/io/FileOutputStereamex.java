package com.deloitte.corejava.training.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStereamex {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("abc.txt", true);
		String s="Spring is also my favorite framework";
		byte[] bytes = s.getBytes();
		fos.write(bytes);
		System.out.println("File write operation is successful");
		fos.close();
	}

}
