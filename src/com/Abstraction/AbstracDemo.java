/**
 * 
 */
package com.Abstraction;

/**
 * example pegram for abstraction
 * @author mkanakkanadar
 * 28/04/2023
 */
abstract class Shape
{
	public void draw() {
		System.out.println("Inside shape Draw method");
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}
class Circle extends Shape
{
	float radius;
	
	public Circle(float radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return (Math.PI*radius*radius);
	}
	public double getPerimeter() {
		return (2*Math.PI*radius);
	}	
}
class Rectangle extends Shape {
	float length,breadth;
	public Rectangle(float length, float breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public double getArea() {
		return (length*breadth);
	}
	public double getPerimeter() {
		return (2*(length*breadth));
	}
}
class Square extends Shape
{
    float side;
    public Square(float side) {
    	this.side = side;
    }
    public double getArea() {
	    return (side*side);
}
    public double getPerimeter() {
	    return (4*side);
}
}
public class AbstracDemo {
	public static void main(String args[]) {
		
		Shape s = new Circle(2.5f);
		System.out.println("Circle Area: "+s.getArea()+" | "+"Circle Perimeter: "+s.getPerimeter());
		
		s = new Square(1.2f);
		System.out.println("Square Area: "+s.getArea()+" | "+"Square Perimeter: "+s.getPerimeter());
		
		s = new Rectangle(1.2f,1.2f);
		System.out.println("Rectangle Area: "+s.getArea()+" | "+"Square Perimeter: "+s.getPerimeter());
	}
  
}
