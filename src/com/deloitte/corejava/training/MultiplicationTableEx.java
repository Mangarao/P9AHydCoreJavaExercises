package com.deloitte.corejava.training;
import java.util.Scanner;
public class MultiplicationTableEx {
	void printTable(int num) {
		for (int i = 1; i <= 10; i++) {
		//	System.out.println(num + " * " + i + " = " + (num * i));
			System.out.printf("%d * %d = %d \n",num,i, (num*i)  );
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to print its table");
		int num = scan.nextInt();
		MultiplicationTableEx m = new MultiplicationTableEx();
		m.printTable(num);

	}

}
