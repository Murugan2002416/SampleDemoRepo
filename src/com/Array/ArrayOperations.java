/**
 * 
 */
package com.Array;

/**
 * program to do array operation
 * @author mkanakkanadar
 * 26/04/2023
 */
public class ArrayOperations {
	public static void main(String args[]) {
		int inputArray[] = {25,45,20,15,40};
		int arraySum=0,arrayProduct=1;
		for(int i=0; i<inputArray.length; i++)
		{
			 arraySum = arraySum+inputArray[i];
			 arrayProduct = arrayProduct*inputArray[i];
		}
	   System.out.println(arraySum+" "+(arraySum/inputArray.length)+" "+arrayProduct);
	}

}
