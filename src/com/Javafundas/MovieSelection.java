/**
 * 
 */
package com.Javafundas;

/**
 * program to select a movie using switch case
 * @author mkanakkanadar
 * 25/04/2023
 */
import java.util.Scanner;
public class MovieSelection {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choice");
		int movieType = scan.nextInt();
		scan.close();
		switch(movieType)
		{
		case 1:
			System.out.println("User choice movie by title");
			break;
		case 2:
			System.out.println("User choice movie by Language");
			break;
		case 3:
			System.out.println("user choice movie by releasedate");
			break;
		case 4:
			System.out.println("user choice movie by genre");
			break;
			
			
		}
	}

}
