package com.index;
import java.util.*;
public class ReverseInteger {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int c=0;
		while(num>0) {
			int x=num%10;
			c=c*10+x;
			num/=10;
		}
		System.out.println(c);
	}

}
