package com.index;
import java.util.*;
public class Students {
     public static void main (String[] args) {
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("Enter your name:");
    	 String st_name=s.nextLine();
    	 System.out.println("Enter your rollno:");
    	 int st_roll=s.nextInt();
    	 System.out.println("Enter your 5 Sub marks:");
    	 float sub1=s.nextFloat();
    	 float sub2=s.nextFloat();
    	 float sub3=s.nextFloat();
    	 float sub4=s.nextFloat();
    	 float sub5=s.nextFloat();
    	 
    	 float Avg=(sub1+sub2+sub3+sub4+sub5)/5;
    	 System.out.println("Student name is:"+st_name);
    	 System.out.println("Roll no:"+st_roll);
    	 System.out.println("Average marks of 5 subjects:"+Avg);
    	 
     }
}
