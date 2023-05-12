/**
 * 
 */
package com.Array;

/**
 * program for copy and reverse an array
 * @author mkanakkanadar
 * 26/04/2023
 */
public class ReverseArray {
	public static void main(String args[]) {
		int norArray[] = {12,32,45,11,2,51,7,13,26,35};
		int revArray[] = new int[norArray.length];
		for(int i=0; i<norArray.length; i++)
		{
			revArray[9-i] = norArray[i];
		}
		for(int i=0; i<norArray.length; i++)
		{
			System.out.print(revArray[i]+" ");
		}
		
	}

}
