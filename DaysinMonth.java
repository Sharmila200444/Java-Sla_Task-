package com.index;
import java.util.*;
public class DaysinMonth {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Month(1-12):");
		int month=s.nextInt();
		System.out.println("Enter Year:");
		int year=s.nextInt();
		
		int days=0;
		
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			days=31;
		}
		else if(month==2) {
			if((year%4==0 && year%100 !=0) || year%400==0 ) {
				days=29;
			}
			else {
				days=28;
			}
		}
		else if(month==4 || month==6 || month==9 || month==11) {
			days=30;
		}
		else {
			System.out.println("Invalid month");
			return;
		}
		System.out.println(days);
		// TODO Auto-generated method stub

	}

}
