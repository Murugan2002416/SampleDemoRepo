/**
 * 
 */
package com.Inheritance;

/**
 * program to use 
 * @author mkanakkanadar
 *
 */
class Base
{
	 Base()
	{
		System.out.println("Basi is here");
	}
}
class Derived1 extends Base
{
	 Derived1()
	{
		System.out.println("Deived1 constructor is printed");
	}
}
class Derived2 extends Derived1
{
	Derived2()	{
		System.out.println("Derived2 is printed");
	}
}
public class ConstructorExample {
	public static void main(String args[])
	{
		Derived2 obj = new Derived2();
	 }

}
