package com.index;
import java.util.*;
public class Pyramid3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int p3=s.nextInt();
		for(int i=1; i<=p3;i++) {
			for(int j=1; j<=p3-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}
		// TODO Auto-generated method stub
		

	

}
