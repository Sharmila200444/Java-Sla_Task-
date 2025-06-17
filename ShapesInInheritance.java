package com.Task;

class Shape{
	void getArea() {}
	void getPerimeter() {}
}
class Circle1 extends Shape{
	double pi=3.14;
	void getArea(int radius) {
		double c=(int)pi*radius*radius;
		System.out.println("Area of Circle is : "+c);
	}
	void getPerimeter(int radius) {
		double c=2*pi*radius;
		System.out.println("Perimeter of Circle is : "+(int)c);
	}
}
public class ShapesInInheritance {

	public static void main(String[] args) {
		Circle1 c=new Circle1();
		c.getArea(4);
		c.getPerimeter(5);
		// TODO Auto-generated method stub

	}

}
