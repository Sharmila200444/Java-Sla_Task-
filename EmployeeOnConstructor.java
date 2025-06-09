package com.index;
import java.util.*;
public class EmployeeOnConstructor {
	int emp_id;
	String emp_name;
	String emp_desigination;
	String emp_location;
	
	EmployeeOnConstructor(int emp_id,String emp_name,String emp_desigination,String emp_location){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_desigination=emp_desigination;
		this.emp_location=emp_location;
	}
	void display() {
		
		System.out.println(emp_id+"|| "+emp_name+"|| "+emp_desigination+"|| "+emp_location);
	}
	public static void main(String[]args) {
		System.out.println("ID "+"||"+"NAME "+"||"+"DESIGINATION "+"||"+"LOCATION");
		System.out.println("-----------------------------------------------");
		EmployeeOnConstructor empobj=new EmployeeOnConstructor(101,"Shamila","HR","Chennai");
		EmployeeOnConstructor empobj1=new EmployeeOnConstructor(102,"Subha","Java developer","Chennai");
		EmployeeOnConstructor empobj2=new EmployeeOnConstructor(103,"Abarna","Tester","Vadaplani");
		EmployeeOnConstructor empobj3=new EmployeeOnConstructor(104,"Thamizh","Team Lead","Bengalore");
		EmployeeOnConstructor empobj4=new EmployeeOnConstructor(105,"Sabari","DotNet Developer","Tambaram");
		
		empobj.display();
		empobj1.display();
		empobj2.display();
		empobj3.display();
		empobj4.display();	
	}

}
