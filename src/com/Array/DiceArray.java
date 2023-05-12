/**
 * 
 */
package com.Array;

/**
 * program to print the value of an dice
 * @author mkanakkanadar
 * 26/04/2023
 */
//import java.util.Math;
public class DiceArray {
	public static void main(String args[]) {
		int diceArray[] = new int[10];
		for(int i=0; i<diceArray.length; i++)
		{
			 diceArray[i] = (int)((Math.random()*6)+1);
			 System.out.print(diceArray[i]+" ");
		}
	}

}
