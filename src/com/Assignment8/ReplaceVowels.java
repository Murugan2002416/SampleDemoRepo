/**
 * 
 */
package com.Assignment8;

/**
 * program to replace vowels with z
 * @author mkanakkanadar
 * 03/05/2023
 */
import java.util.Scanner;
public class ReplaceVowels {
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		String inputUse = userInput.replaceAll("[a e i o u A E I O U]","z");
		scan.close();
		if(userInput.equals(inputUse))
		{
		System.out.println(userInput+" "+"No Vowels Present");
		}
		else
			System.out.println(userInput.replaceAll("[a e i o u A E I O U]","z"));
	}
}
