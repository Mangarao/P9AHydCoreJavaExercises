package com.deloitte.corejava.training;

import com.deloitte.corejava.training1.Cube;

public class TestCube {
	
	public static void main(String[] args) {
		Cube c= new Cube();
		int cube = c.getCube(3);
		System.out.println("cube of the number is: "+cube);
	}

}
