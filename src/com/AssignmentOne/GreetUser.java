/**
 * 
 */
package com.AssignmentOne;

import java.util.Scanner;

/**
 * progarm to greet the users
 * @author mkanakkanadar
 * 26/04/2023
 */
public class GreetUser {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String greetUser1,greetUser2;
		greetUser1 = scan.next();
		greetUser2 = scan.next();
		System.out.print("Welcome "+greetUser1+"! Welcome "+greetUser2+" too!");
	}

}
