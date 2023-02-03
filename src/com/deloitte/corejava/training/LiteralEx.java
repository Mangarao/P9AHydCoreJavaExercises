package com.deloitte.corejava.training;

public class LiteralEx {
	


	public int add(int num1, int  num2) {
		return num1+num2;
		
	}
	
	public static void main(String[] args) {
		LiteralEx l=new LiteralEx();
		int res = l.add(20,30);
		System.out.println("sum: "+res);
		int res1=l.add(100, 200);
		System.out.println("sum: "+res1);
		
		/*
		 * System.out.println("\"Hello World\""); System.out.print("Manga\t\t");
		 * System.out.print("Rao");
		 */
		
		
	}

}
