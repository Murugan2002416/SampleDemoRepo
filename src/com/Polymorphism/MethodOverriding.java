/**
 * 
 */
package com.Polymorphism;

/**
 * Example for method overriding
 * @author mkanakkanadar
 *
 */
class Vehicle {
	public void run() {
		System.out.println("Inside vehicle run method");
	}
}
class Truck extends Vehicle {
	public void run() {
		System.out.println("Inside Truck run method");
	}
}
class Bike extends Vehicle
{
	public void run() {
		System.out.println("Inside Bike run method");
	}
}
public class MethodOverriding {
	public static void main(String args[]) {
		Vehicle vehicle = new Vehicle(); //Make sure that to use upcasting all methods name should be same else it will gives you error
		vehicle.run(); //To call Vehicle class method
		
		vehicle = new Truck();
		vehicle.run(); //To call Truck class methoad
		
		vehicle = new Bike();
		vehicle.run(); //To call Bike class methoad
	}

}
