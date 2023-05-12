/**
 * 
 */
package com.Javafundas;

/**
 * proram to display question and get the answer
 * @author mkanakkanadar
 *27/04/2023
 */
import java.util.Scanner;
public class DisplayQuestion {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("What is the unit currency in India");
		String countryName =  scan.nextLine();
		String countryName1;
		int ansTrial = 3;
		while(ansTrial!=0 ) {
			if(ansTrial==3)
			{
			if(ansTrial!=0 && countryName.equals("Rupee"))
			System.out.print("Answer is correct");
			else  
				System.out.print("Try again");
			}
			ansTrial--;
			if(ansTrial==2)
			{
			countryName1 = scan.next();
		   if(countryName1.equals("Rupee"))
		        System.out.println("Answer is correct");
			else  
				System.out.println("Try again");
			}
		     ansTrial--;
			String countryName2 = scan.next();
			if(ansTrial==1)
			{
			if(countryName2.equals("Rupee"))
				System.out.println("Answer is correct");
			else
				System.out.println("Sorry it is Rupee");
			}
			ansTrial--;
			
		 
		}
		
	}

}
