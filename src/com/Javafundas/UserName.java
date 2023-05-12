/**
 * 
 */
package com.Javafundas;

/**
 * Program to check the seat is available
 * @author mkanakkanadar
 * 25/04/2023
 */
import java.util.Scanner;
public class UserName {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Username: ");
		String userName = scan.next();
		System.out.println("Enter the Password: ");
		String passWord = scan.next();
		if(userName.equals("Murugan")&&passWord.equals("expleo"))
		{
		System.out.println("You have logged in and you can book a ticket now");
		System.out.println("Enter the seat Number: ");
		String seatNumber = scan.next();
		scan.close();
		boolean isAvailable=true;
		if(isAvailable)
			System.out.println("Seatnumber "+seatNumber+ "is Available");
		else
			System.out.println("Seatnumber is not available");
		}
		
		
		
		
	}

}
