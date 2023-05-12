/**
 * 
 */
package com.Assignment8;

/**
 * program to count character occurences in a string
 * @author mkanakkanadar
 * 03/05/2023
 */
public class CharacterCountString {
	public static void main(String args[]) {
		String str = "malayalam";
		char arr[] = str.toCharArray();
		for(int i=0; i<arr.length; i++)
		{
			int count=1;
			for(int j=i+1; j<arr.length; i++)
			{
				if(arr[i]==arr[j])
				{
				//arr[j] = '0';
				count++;
				}
			}
			System.out.println(arr[i]+" "+count);
		}

	}

}
