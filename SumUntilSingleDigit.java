package com.Task;
import java.util.*;
public class SumUntilSingleDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=234;
		int n1=a;
		int temp;
		while(n1>=10) {
			temp=0;
			while(n1>0) {
				int digit=n1/10;
				temp+=digit;
				n1/=10;
			}
			n1=temp;
			
			
		}
		System.out.println("Sum of Digits unitl is singleDigit is :"+n1 );
		
		// TODO Auto-generated method stub

	}

}
