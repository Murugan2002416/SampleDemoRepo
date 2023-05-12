/**
 * 
 */
package com.Javafundas;

import java.util.Scanner;

/**
 * Program to print the availability of the seat
 * @author mkanakkanadar
 * 25/04/2023
 */
class UnconditionalSeat {
	public static void main(String args[]) {
		 int[][] arrayName = new int[][] {{1,2},{3,4},{5,6}};
		 for(int i=0; i<arrayName.length; i++)
		 {
			 for(int j=0; j<arrayName[i].length; j++)
			 {
				 System.out.print(arrayName[i][j]);
			 }
			 System.out.println();
		 }
	}

}
