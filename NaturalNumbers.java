package com.index;
import java.util.*;
public class NaturalNumbers {
	static void Natural(int num) {
		if(num<=10) {
			System.out.println(num);
			Natural(num+1);
		}
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Natural(1);
	}

}
