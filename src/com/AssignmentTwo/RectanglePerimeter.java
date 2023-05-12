/**
 * 
 */
package com.AssignmentTwo;

/**
 * program to find the perimeter of the rectangle
 * @author mkanakkanadar
 * 26/04/2023
 */
import java.util.Scanner;
public class RectanglePerimeter {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int rectangleLength, rectangleBreadth;
		rectangleLength = scan.nextInt();
		rectangleBreadth = scan.nextInt();
		scan.close();
		int rectanglePerimeter = (2*rectangleLength) + (2*rectangleBreadth);
		System.out.print(rectanglePerimeter);
	}

}
