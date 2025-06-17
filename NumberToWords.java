package com.Task;

public class NumberToWords {

	public static void main(String[] args) {
		int num=2468;
		String st="";
		while(num>0) {
			int digit=num%10;
			if(digit==2) {
				st="Two "+st;
			}
			else if(digit==4) {
				st="Four "+st;
			}
			else if(digit==6) {
				st="Six "+st;
			}
			else if(digit==8) {
				st="Eight "+st;
			}
			num/=10;
			
		}
		System.out.println(st);
		// TODO Auto-generated method stub

	}

}
