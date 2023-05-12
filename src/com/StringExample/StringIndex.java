/**
 * 
 */
package com.StringExample;

/**
 * @author mkanakkanadar
 *
 */
import java.util.Scanner;
public class StringIndex {
	public static boolean stringInstring(String str,String str1)
	{
		if(str.contains(str1))
			return true;
		else
			return false;
	}
	public static void main(String args[]) 
	{
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the String one :");
			String str = scan.nextLine();
			System.out.println("Enter the string two: ");
			String str1 = scan.nextLine();
			scan.close();
			if(stringInstring(str,str1))
			System.out.println("String 1 contains String 2");
			else
				System.out.println("String one not contains string two");
	}
}
