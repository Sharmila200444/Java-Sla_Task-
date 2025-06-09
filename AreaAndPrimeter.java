package com.index;
import java.util.*;
public class AreaAndPrimeter {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Radius");
		double r=s.nextDouble();
		
		double pi = 3.14159;
		double area=pi*r*r;
		double primeter=2*pi*r;
		
		System.out.println("Area of Circle:"+area);
		System.out.println("Primeter of circle:"+primeter);
		
	}

}
