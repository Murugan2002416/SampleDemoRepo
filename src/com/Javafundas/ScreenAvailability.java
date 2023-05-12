/**
 * 
 */
package com.Javafundas;

import java.util.Scanner;

/**
 * Progran seat availability of two screen
 * @author mkanakkanadar
 * 25/04/2023
 */
public class ScreenAvailability {
	public static void main(String args[]) {
		String next = System.lineSeparator();
		for(int Screen=1; Screen<=2; Screen++)
		{
			if(Screen==1)
				System.out.println("Screen 1 Availability Details");
			else
				System.out.println("Screen 2 Availability Details");
			for(int seat=1; seat<=5; seat++)
			{
				System.out.println(" Current seat availability: "+seat+next);
			}
		}
	 
	}

}
