/**
 * 
 */
package com.AssignmentOne;

/**
 * program to print a price variable
 * @author mkanakkanadar
 * 26/04/2023
 */
public class PriceVariable {
	public static void main(String args[]) {
		int price = 52;
		float priceInFloat = price;
		byte age = 83;
		int intAge = age;
		int highestAge = 120;
		byte byteAge = (byte)highestAge;
		System.out.println(price+" "+priceInFloat+" "+age+" "+intAge+" "+highestAge+" "+byteAge);
		highestAge = 130;
		byteAge = (byte)highestAge;
		System.out.println(highestAge+" "+byteAge);
	}

}
