/**
 * 
 */
package com.Javafundas;

/**
 * Program to print the type of the movie using for each
 * @author mkanakkanadar
 * 25/04/2023
 */
import java.util.Scanner;
public class ForEEachMovie {
	public static void main(String args[]) {
		String[] movieName =  {"AAA","BBB","CCC","DDD"};
		String movieGenre[] = {"ACTION","COMEDY","THRILLER","ACTION"};
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the genre to be searched");
		String userGenre = scan.next();
		int counter = 0;
		for(String i : movieGenre)
		{
			if(i.equals(userGenre))
			{
				System.out.println(movieName[counter]);
			}
			counter++;
		}
		
	}

}
