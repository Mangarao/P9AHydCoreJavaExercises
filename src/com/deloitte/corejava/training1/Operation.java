package com.deloitte.corejava.training1;
strictfp interface I{
	
}
strictfp public class Operation {
	int data=50;
	strictfp public void change(Operation op) {
		op.data=op.data+500;
	}

	public static void main(String[] args) {
		Operation o = new Operation();
		o.change(o);
		System.out.println(o.data);
	}

}
