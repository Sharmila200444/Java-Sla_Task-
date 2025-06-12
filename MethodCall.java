package com.Task;

public class MethodCall {
	static int a;
	static int b;
	int c;
	
	static void add(int a,int b) {
		System.out.println("Addition of a and b is :"+a+b);
   }
	static void Multiplication(int a,int b) {
		System.out.println("Multiplication of and b is :"+a*b);
	}
	void Divide(int a,int b) {
		c=a/b;
		System.out.println("Division of a and b is :"+c);
	}
	

	public static void main(String[] args) {
		MethodCall mc=new MethodCall();
		add(7,8);
		Multiplication(5,4);
		mc.Divide(10,5);
		// TODO Auto-generated method stub

	}

}
