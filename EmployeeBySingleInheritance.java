package com.Task;

class Employee{
	void work() {
		System.out.println("Employee works in Electric DEpartment");
		}
	void getSalary()
{
		System.out.println("Employee Salary is 25000");}
}
class HRManager extends Employee{
	void work(){
		System.out.println("HR Manager is working on HR department");
	}
	void addEmployee(String name) {
		
		System.out.println("Adding new employee named "+name);
	}
}

public class EmployeeBySingleInheritance {

	public static void main(String[] args) {
		HRManager obj=new HRManager();
		obj.work();
		obj.getSalary();
		obj.addEmployee("Sharmila");

	}

}
