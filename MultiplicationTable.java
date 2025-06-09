package com.index;
import java.util.*;
public class MultiplicationTable {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i=1;
		if(num<=10) System.out.println(num+"x"+i+++"="+(num*1));
		if(num<=10) System.out.println(num+"x"+i+++"="+(num*2));
		if(num<=10) System.out.println(num+"x"+i+++"="+(num*3));
		if(num<=10) System.out.println(num+"x"+i+++"="+(num*4));
		if(num<=10) System.out.println(num+"x"+i+++"="+(num*5));
		if(num<=10) System.out.println(num+"x"+i+++"="+(num*6));
		if(num<=10) System.out.println(num+"x"+i+++"="+(num*7));
		if(num<=10) System.out.println(num+"x"+i+++"="+(num*8));
		if(num<=10) System.out.println(num+"x"+i+++"="+(num*9));
		if(num<=10) System.out.println(num+"x"+i+++"="+(num*10));
		
	}

}
