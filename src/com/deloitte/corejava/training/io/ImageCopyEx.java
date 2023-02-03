package com.deloitte.corejava.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyEx {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("images//javalogo.png");
			FileOutputStream fos=new FileOutputStream("images//javalogocopy.png");
			int i=0;
			while((i=fis.read())!=-1) {
				fos.write(i);
			}
			
			fos.close();
			fis.close();
			System.out.println("Image is copied successfully");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
