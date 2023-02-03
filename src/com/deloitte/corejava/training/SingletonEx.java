package com.deloitte.corejava.training;

public class SingletonEx {
	
	private static SingletonEx s;
	
	private SingletonEx() {
		
	}
	
	public static SingletonEx getInstance() {
		if(s==null) {
			s=new SingletonEx();
		}
		return s;
		
		
	}

}
