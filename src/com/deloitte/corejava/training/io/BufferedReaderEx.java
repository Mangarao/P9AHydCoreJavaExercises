package com.deloitte.corejava.training.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
	
	public static void main(String[] args) throws IOException {
		InputStreamReader ir =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		
		System.out.println("Enter your name");
		String readLine = br.readLine();
		System.out.println("Hello, "+readLine);
	}

}
