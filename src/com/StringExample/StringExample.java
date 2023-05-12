/**
 * 
 */
package com.StringExample;

/**
 * @author mkanakkanadar
 *
 */
import java.util.Scanner;
public class StringExample {
	public static int stringIndex(String str,char str1)
	{
		String string = str;
		char letter = str1;
		//int result=-1;
		/*for(int i=0; i<string.length(); i++) //another method
		{
			if(string.charAt(i)==letter)
			{
				result = i;
			}
		}
		return result;*/
		return (string.indexOf(letter));
		
		
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		System.out.println("Enter the letter want to know the index: ");
		char str1 = scan.next().charAt(0);
		System.out.println(stringIndex(str,str1));
		scan.close();
	}

}
