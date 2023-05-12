/**
 * 
 */
package com.Javafundas;

/**
 * Profram to get a max number
 * @author mkanakkanadar
 * 25/04/2023
 */
import java.util.*;
public class ForEachLoopMaxNumber {
	public static void main(String args[])
	{
		int[] stuMarks = new int[]{125,132,95,116,654};
		int maxNo = stuMarks[0];
		for(int i : stuMarks)
		{
			 if(i>maxNo)
				 maxNo = i;
		}
		System.out.print(maxNo);
		
		
	}

}
