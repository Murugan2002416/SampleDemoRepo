/**
 * 
 */
package com.AssignmentTwo;

/**
 * program to find the cube of a number
 * @author mkanakkanadar
 * 26/04/2023
 */
import java.lang.Math;
import java.util.Scanner;
public class NumberCube {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int power = 3;
		int userNumber = scan.nextInt();
		scan.close();
		System.out.print((int)Math.pow(userNumber,power));
	}

}
