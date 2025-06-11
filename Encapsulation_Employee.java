package com.Task;

public class Encapsulation_Employee {
	private int emp_id;
	private String emp_name;
	private String emp_loc;
	
	void setId(int emp_id){
		this.emp_id=emp_id;
	}
    int getId() {
		return emp_id;
	}
    void setName(String emp_name) {
    	this.emp_name=emp_name;
    }
    String getName() {
    	return emp_name;
    }
    void setLoc(String emp_loc) {
    	this.emp_loc=emp_loc;
    }
    String getloc() {
    	return emp_loc;
    }
    public static void main(String[] args) {
    	Encapsulation_Employee obj=new Encapsulation_Employee();
    	System.out.println("Employee Details");
    	obj.setId(101);
    	System.out.println(obj.getId());
    	obj.setName("Sharmi");
    	System.out.println(obj.getName());
    	obj.setLoc("Chennai");
    	System.out.println(obj.getloc());
		// TODO Auto-generated method stub

	}

}
