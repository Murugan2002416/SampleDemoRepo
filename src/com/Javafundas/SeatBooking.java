/**
 * 
 */
package com.Javafundas;

/**
 * Booking a seat for a movie
 * @author mkanakkanadar
 * 25/04/2023
 */
import java.util.Scanner;
public class SeatBooking {
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Please Enter your Seat Number");
	String seatNumber = scan.next();
	scan.close();
    boolean seatAvailable=true;
	if(seatAvailable)
		System.out.println("You Have Successfully Booked Your "+seatNumber+" Seat");
	else
		System.out.print("Seat is Not Available");
		}
}
