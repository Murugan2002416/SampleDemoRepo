/**
 * 
 */
package com.Javafundas;
import java.util.Scanner;
/**
 * program to print the order of the elements
 * @author mkanakkanadar
 * 25/04/2023
 */
public class IncreasingDecreasing {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int inOne,inTwo,inThree;
		System.out.print("Enter the input values");
		inOne = scan.nextInt();
		inTwo = scan.nextInt();
		inThree = scan.nextInt();
		scan.close();
		if(inOne<inTwo && inTwo<inThree && inThree>inOne)
			System.out.print("Increasing");
		else if(inOne>inTwo && inTwo>inThree && inThree<inOne)
			System.out.print("Decreasing");
		else
			System.out.println("Neither Increasing Nor Decreasing Order");
		
				
	}

}
