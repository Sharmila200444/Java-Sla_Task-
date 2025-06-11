package com.Task;

public class Circle {
	private int radius;
	
	void setRad(int radius) {
		this.radius=radius;
	}
	int getRad() {
		return radius;
	}
	
	void CalculateArea(){
		double pi=3.14;
		int ar=(int)(pi*radius*radius);
		System.out.println("Area of Circle is:"+ar);
	}
	void CalculatePerimeter() {
		double pi=3.14;
		int pr=(int)(2*pi*radius);
		System.out.println("Perimeter of Circle is:"+pr);
	}

	public static void main(String[] args) {
		Circle obj=new Circle();
		obj.setRad(6);
		obj.CalculateArea();
		obj.CalculatePerimeter();
		// TODO Auto-generated method stub

	}

}
