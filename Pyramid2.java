package com.index;

public class Pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p2=9;
		
		for(int i=1; i<=p2;i++) {
			for(int j=1; j<=p2-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
