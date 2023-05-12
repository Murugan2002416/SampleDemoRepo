/**
 * 
 */
package com.StringExample;

/**
 * program to check the String is palindrome or not
 * @author mkanakkanadar
 * 03/05/2023
 */
public class PalindromeString {
	public static void main(String args[]) {
		StringBuilder str = new StringBuilder("malayalam");
		if((str.reverse()).equals(str))
			System.out.println("is palindrome");
		else
			System.out.println("Not a palindrome");
			
	}

}
