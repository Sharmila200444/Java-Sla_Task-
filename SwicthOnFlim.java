package com.index;
import java.util.*;
public class SwicthOnFlim {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int screen=s.nextInt();
		s.nextLine();
		String Timing=s.nextLine();
		switch(screen) {
		case 1:
			switch(Timing) {
			case "7-10":
				System.out.println("Maman");
				break;
				
			case "10-1":
				System.out.println("Thug life");
				break;
			case "1-4":
				System.out.println("Retro");
			}
			break;
		case 2:
			switch(Timing) {
			case "7-10":
				System.out.println("Kingston");
				break;
				
			case "10-1":
				System.out.println("Sumo");
				break;
			case "1-4":
				System.out.println("Virunnu");
			}
			break;
		case 3:
			switch(Timing) {
			case "7-10":
				System.out.println("Dragon");
				break;
				
			case "10-1":
				System.out.println("Gajaana");
				break;
			case "1-4":
				System.out.println("Bayamariya Brammai");
			}
			break;
		case 4:
			switch(Timing) {
			case "7-10":
				System.out.println("Minmini");
				break;
				
			case "10-1":
				System.out.println("Good Bad Ugly");
				break;
			case "1-4":
				System.out.println("2K Love Story");
			}
		}
	}

}
