package com.deloitte.corejava.training.exceptionhandling;

public class FinalizeEx {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized method is called");
	}

	public static void main(String[] args) {
		FinalizeEx f1=new FinalizeEx();
		FinalizeEx f2=new FinalizeEx();
		f1=null;
		f2=null;
		System.gc();
				
	}
}
