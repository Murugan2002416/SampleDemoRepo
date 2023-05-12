/**
 * 
 */
package com.Javafundas;

/**
 * Program to add two number if that number is "leen" means in between 13 to 19 just return 19
 * @author mkanakkanadar
 * 25.04/2023
 */
import java.util.Scanner;
public class AddNumbers {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int inputOne,inputTwo;
		System.out.println("Enter the values");
		inputOne = scan.nextInt();
		inputTwo = scan.nextInt();
		scan.close();
		if(inputOne>=13 && inputOne<=19 || inputTwo<=19 && inputTwo>=13)
			System.out.println(19);
		else
			System.out.println(inputOne+inputTwo);
	}

}
