/**
 * 
 */
package com.Array;

/**
 * program to find the type of an element in an array
 * @author mkanakkanadar
 * 26/04/2023
 */
public class ArrayType {
	public static void main(String args[]) {
		int inputArray[] = {1,-3,6,9,8,-13,-5,7,0,12,0,-4,4,0,17,21,6,16,11,19};
		int positiveNumbers = 0, negativeNumbers = 0, zeroValues = 0, evenNumbers = 0, oddNumbers = 0;
		for(int i=0; i<inputArray.length; i++)
		{
			if(inputArray[i]>0)
				positiveNumbers++;
			else if(inputArray[i]<0)
				negativeNumbers++;
			else  
				zeroValues++;
		}
		for(int i=0; i<inputArray.length; i++)
		{
			if(inputArray[i]%2==0)
				evenNumbers++;
			else
				oddNumbers++;
		}
		System.out.print(positiveNumbers+" "+negativeNumbers+" "+evenNumbers+" "+oddNumbers+" "+zeroValues);
	}

}
