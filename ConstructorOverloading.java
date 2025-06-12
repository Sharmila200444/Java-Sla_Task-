package com.Task;

public class ConstructorOverloading {
	private int Stu_id;
	private String stu_name;
	private String stu_dept;
	
	ConstructorOverloading(int Stu_id){
		this.Stu_id=Stu_id;
	}
	ConstructorOverloading(int Stu_id,String stu_name){
		this.Stu_id=Stu_id;
		this.stu_name=stu_name;
	}
	ConstructorOverloading(int Stu_id,String stu_name,String stu_dept){
		this.Stu_id=Stu_id;
		this.stu_name=stu_name;
		this.stu_dept=stu_dept;
	}
	
	void display() {
		System.out.println("The Student id is :"+Stu_id);
		System.out.println("The Student name is :"+stu_name);
		System.out.println("The Student Department is :"+stu_dept);
	}
	
	

	public static void main(String[] args) {
		ConstructorOverloading c1=new ConstructorOverloading(101);
		ConstructorOverloading c2=new ConstructorOverloading(101,"Sharmila");
		ConstructorOverloading c3=new ConstructorOverloading(101,"Sharmila","CSE");
		c1.display();
		c2.display();
		c3.display();
		
		
		// TODO Auto-generated method stub

	}

}
