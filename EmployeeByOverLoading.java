package com.Task;

public class EmployeeByOverLoading {
	 public void print(int Emp_id,int age) {
		System.out.println("Employee id:"+Emp_id);
		System.out.println("Employee age:"+age);
		
	}
	 public void print(String name,String Location) {
		 System.out.println("Employee name:"+name);
		 System.out.println("Employee Location:"+Location);
		 
	}
	 
	public static void main(String[] args) {
		
		EmployeeByOverLoading e1=new EmployeeByOverLoading();
		e1.print(101,42);
		e1.print("Sharmila","Chennai");
		// TODO Auto-generated method stub

	}

}
