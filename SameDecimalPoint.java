package com.index;
public class SameDecimalPoint {

	public static void main(String[] args) {
		int num1=1024;
		int num2=3024;
		
		int n1=num1%100;
		int n2=num2%100;
		if(n1==n2) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
		// TODO Auto-generated method stub

	}

}
