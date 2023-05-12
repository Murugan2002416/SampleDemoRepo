/**
 * 
 */
package com.Array;

/**
 * program to print the maximum and minimum number in an array
 * @author mkanakkanadar
 * 26/04/2023
 */
public class MaxMinArray {
	public static void main(String args[]) {
		int arrayOperation[] = {10,67,23,8,35};
		int arrayMax = arrayOperation[0];
		int arrayMin = arrayOperation[1];
		for(int i=0; i<arrayOperation.length; i++)
		{
			if(arrayOperation[i]>arrayMax)
				arrayMax = arrayOperation[i];
			else if(arrayOperation[i]<arrayMin)
				arrayMin = arrayOperation[i];
		}
		System.out.println(arrayMax+" "+arrayMin);
	}

}
