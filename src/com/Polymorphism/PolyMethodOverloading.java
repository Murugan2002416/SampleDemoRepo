/**
 * 
 */
package com.Polymorphism;

/**
 * program to display method overloading 
 * @author mkanakkanadar
 * 28/04/2023
 */
public class PolyMethodOverloading {
	 static int add(int first,int second)
	 {
		 return first+second;
	 }
	 static double add(double first,double second)
	 {
		 return first+second;
	 }
	 static char add(char first, char second)
	 {
		 return (char)(first+second);//plus applied only for integers
	 }
	 static String add(String first, String second)
	 {
		 return first.concat(second);
	 }
	 public static void main(String args[]) {
		 System.out.println("Adding two Numbers: "+add(2,3));
		 System.out.println("Adding two doubles: "+add(5.8,3.6));
		 System.out.println("Adding two Characters: "+add('1','0'));//ascii for 1=49,0=48;
		 System.out.println("Adding two Strings: "+add("Method","Overloading"));
	 }

}
