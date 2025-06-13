package com.Task;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int t=a;
		int temp=0;
		while(t>0) {
			int digit=t%10;
			temp=temp*10+digit;
			t/=10;
		}
		if(temp==a) {
		System.out.println("The number is Palindrome");
		// TODO Auto-generated method stub

	}
	else {
		System.out.println("Not Plaindrome");
	}

}
}
