package com.index;
import java.util.*;
public class EvenOrOdd {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=s.nextInt();
		if(num%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
	}

}
