package com.Task;
import java.util.*;
public class LargestAndSmallestElementInArr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int arr[]=new int[num];
		for(int i=0; i<num;i++) {
			arr[i]=s.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1; i<num;i++ ) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
			
			
		}
		System.out.println("Largest element in array is : "+max);
		System.out.println("Smallest element in array is : "+min);
		
		// TODO Auto-generated method stub

	}

}
