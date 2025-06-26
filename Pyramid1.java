package com.index;

public class Pyramid1 {

	public static void main(String[] args) {
		int p1=9;
		for(int i=1; i<=p1;i++) {
			for(int j=1; j<=p1-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
