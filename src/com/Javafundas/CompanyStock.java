/**
 * 
 */
package com.Javafundas;

/**
 * program to diplay stock availability
 * @author mkanakkanadar
 * 27/04/2023
 */
import java.util.Scanner;
public class CompanyStock {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int comStock = scan.nextInt();
		int cusStock = scan.nextInt();
		String isCredit = scan.next();
		if(comStock>cusStock && isCredit.equals("N"))
			System.out.println(cusStock+" Supplied");
		else if((comStock<cusStock || comStock>cusStock) && isCredit.equals("Y"))
			System.out.println("Cannot supply");
		else if(comStock<cusStock && isCredit.equals("N"))
			System.out.println(cusStock+" supplied. Out of stock. Balance will be refunded");
	}

}
