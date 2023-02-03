package com.deloitte.corejava.training.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteEx {
	
	public static void main(String[] args) {
		File inputFile= new File("abc.txt");
		File outputFile=new File("abc1.txt");
		System.out.println("input file absolute path: "+ inputFile.getAbsolutePath());
		System.out.println("Relative path: "+inputFile.getPath());
		
		try {
			FileReader fr=new FileReader(inputFile);
			FileWriter fw=new FileWriter(outputFile);
			int i=0;
			while((i=fr.read())!=-1) {
				fw.write((char)i);
			}
			
			fw.flush();
			
			System.out.println("File write is complete");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
