package com.Task;
import java.util.*;
public class ArrayConcat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of arr1");
		int a1=s.nextInt();
		System.out.println("Enter length of arr2");
		int a2=s.nextInt();
		System.out.println("Enter Elements of arr1");
		int arr1[]=new int[a1];
		for(int i=0; i<a1;i++) {
			arr1[i]=s.nextInt();
		}
		System.out.println("Enter Elements of arr1");
		int arr2[]=new int[a2];
		for(int i=0; i<a2;i++) {
			arr2[i]=s.nextInt();
		}
		int concat[]=new int[a1+a2];
		for(int i=0; i<a1; i++) {
			concat[i]=arr1[i];
			
		}
		for(int i=a1; i<a1+a2; i++) {
			concat[i]=arr2[i-a1];
			
		}
		System.out.print("The Concate of Two Array is ");
		for(int k:concat) {
			System.out.print(k+" ");
		}
		// TODO Auto-generated method stub

	}

}
