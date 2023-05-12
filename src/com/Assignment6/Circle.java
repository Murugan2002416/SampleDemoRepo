/**
 * 
 */
package com.Assignment6;

/**
 * program to display the 
 * @author mkanakkanadar
 *
 */
import java.util.Scanner;
public class Circle {
	 
		private double radius = 1.0;
		private String color = "red";
		
		//Default constructor
		public Circle() {
			
		}
		//parameterized constructor
		public Circle(double radius)
		{
			this.radius = radius;
		}
		public  Circle(double radius,String color) {
			this.radius = radius;
			this.color = color;
		}
		//setter and getter methods
		public void setRadius(double radius) {
			this.radius = radius;
		}
		public void setcolor(String color) {
			this.color = color;
		}
		public double getRadius() {
			return radius;
		}
		public String getColor() {
			return color;
		}
		public double getArea() {
			return(Math.PI*radius*radius);
		}
		//toString method
		public String toString() {
			return "Circle[Radius :"+radius+" | "+"color :"+color+"| "+"Area :"+getArea()+"]";
		}
		public static void main(String args[]) {
			Circle circle1,circle2,circle3,circle4;
			circle1 = new Circle();
			System.out.println("---------Circle1 Area--------");
			System.out.println(circle1);
			System.out.println("-----------------------------");
			Scanner read = new Scanner(System.in);
			
			System.out.println("radius: ");
			circle2 = new Circle(read.nextDouble());
			System.out.println("--------Circle2 Area----------");
			System.out.println(circle2);
			System.out.println("-----------------------------");
			
			System.out.println("Radius :");
			double radius = read.nextDouble();
			System.out.println("Color :");
			String color = read.next();
			circle3 = new Circle(radius,color);
			System.out.println("--------Circle3 Area----------");
			System.out.println(circle3);
			System.out.println("-------------------------------");
			
			circle4 = new Circle();
			System.out.println("Radius :");
			double radius1 = read.nextDouble(); 
			System.out.println("Color : ");
			circle4 = new Circle(radius1,color);
			System.out.println("------Circle4 Area-------------");
			System.out.println(circle4);
			System.out.println("--------------------------------");
			
		}
		

}
