/**
 * 
 */
package com.AssignmentOne;

/**
 * program to evaluate four numbers
 * @author mkanakkanadar
 *
 */
public class FourNumbers {
	public static void main (String args[]) {
		int numberOne, numberTwo, numberThree,numberFour;
		numberFour = 1000;
		numberOne = 1;
		numberTwo = 2;
		numberThree = 3;
		System.out.println(numberOne+" "+numberTwo+" "+numberThree+" "+numberFour);
		numberFour = numberThree;
		numberThree = numberTwo;
		numberTwo = numberOne;
		numberOne = 100;
		System.out.println(numberOne+" "+numberTwo+" "+numberThree+" "+numberFour);
		
	}

}
