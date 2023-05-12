/**
 * 
 */
package com.Javafundas;

/**
 *Program to show different types of seats
 *@author mkanakkanadar
 *25/04/2023
 */
import java.util.Scanner;
public class SeatTypes {
	public static void main(String args[])
	{
		String nextLine = System.lineSeparator();
		System.out.println("Type of seats Available"+nextLine+"REGULAR"+nextLine+"PREMIUM"+nextLine+"EXECUTIVE"+nextLine+"VIP");
		Scanner scan = new Scanner(System.in);
		String seatType = scan.next();
		scan.close();
		System.out.println("You have selected: "+seatType);
		if(seatType.equals("REGULAR"))
			System.out.print("Seat cost: "+50);
		else if(seatType.equals("PREMIUM"))
			System.out.print("Seat cost: "+100);
		else if(seatType.equals("EXECUTIVE"))
			System.out.print("Seat cost: "+150);
		else if(seatType.equals("VIP"))
			System.out.print("Seat cost: "+200);
			
			
			
			
	}

}
