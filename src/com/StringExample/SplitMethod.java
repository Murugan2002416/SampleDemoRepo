/**
 * 
 */
package com.StringExample;

/**
 * program to use split method
 * @author mkanakkanadar
 * 03/05/2023
 */
public class SplitMethod {
	public static void main(String args[])
	{
		String str = "Genius Billionaire playboy philanthrophist";
		String arr[] = str.split(" ");// it always return a array of words based on the delimiter we give here the delimiter is space
		for(String Index : arr)
		{
			System.out.println(Index);
		}
	}
}
