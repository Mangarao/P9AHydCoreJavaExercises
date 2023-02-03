package com.deloitte.corejava.training;

public class RecursionEx {
	
	{
		
	}

	int j;  //Global 
	static int count = 0;

	void printName() {
		int i=10; //local variable
		count++; //count=count+1;

		System.out.println("Manga");
		if (count < 3) {
			printName(); //A method calls itself 
		}
	}

	public static void main(String[] args) {
		count++;
		System.out.println("Main method is executed");
		if(count<3)
		main(null);
		
		/*
		 * RecursionEx r = new RecursionEx(); r.printName();
		 */
	}

}
