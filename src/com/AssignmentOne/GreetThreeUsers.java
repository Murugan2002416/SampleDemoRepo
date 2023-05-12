/**
 * 
 */
package com.AssignmentOne;

/**
 * program to greet three users
 * @author mkanakkanadar
 * 26/04/2023
 */
import java.util.Scanner;
public class GreetThreeUsers {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String GreetUser1,GreetUser2,GreetUser3;
		GreetUser1 = scan.next();
		GreetUser2 = scan.next();
		GreetUser3 = scan.next();
		System.out.print("Welcome "+GreetUser1+"! Welcome "+GreetUser3+"! Welcome "+GreetUser2+"! too");
		}

}
