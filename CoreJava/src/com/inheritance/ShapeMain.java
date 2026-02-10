package com.inheritance;

class Shape {
	public double calculateArea() {
		System.out.println("Calculates the area of the shape");
		return 0.0;
	}
}

class Circle extends Shape{
	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	public double calculateCircleArea() {
		return calculateArea();
	}
}

class Rectangle extends Shape {
	int length , width;

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea() {
		return length*width;
	}
	
	public double calculateRectangleArea() {
		return calculateArea();
	}
}

class Triangle extends Shape {
	int base , height;

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public double calculateArea() {
		return 0.5*base*height;
	}
	
	public double calculateTriangleArea() {
		return calculateArea();
	}
}
public class ShapeMain {

	public static void main(String[] args) {
		
		Shape circle = new Circle(5);
		System.out.println("Calculates the area of the shape : "+circle.calculateArea());
		System.out.println("Calculates the area of the Circle : "+((Circle) circle).calculateCircleArea());
		
		System.out.println("------------------------------------------------------");
		
		Shape rectangle = new Rectangle(4, 6);
		System.out.println("Calculates the area of the shape : "+ rectangle.calculateArea());
		System.out.println("Calculates the area of the Rectangle : "+((Rectangle) rectangle).calculateRectangleArea());
		
		System.out.println("------------------------------------------------------");

		Shape triangle = new Triangle(3, 7);
		System.out.println("Calculates the area of the shape : "+ triangle.calculateArea());
		System.out.println("Calculates the area of the Triangle : "+((Triangle) triangle).calculateTriangleArea());
	}

}
