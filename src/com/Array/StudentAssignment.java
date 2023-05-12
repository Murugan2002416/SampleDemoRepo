/**
 * 
 */
package com.Array;

/**
 * program to assignment to the students
 * @author mkanakkanadar
 * 26/04/2023
 */
public class StudentAssignment {
	public static void main(String args[]) {
		int stuMarks[] = {9,3,0,44,26,5,67,45,89,10};
		int marksSum = 0;
		 for(int i=0; i<stuMarks.length; i++)
		 {
	          marksSum = stuMarks[i]+marksSum;
		 }
		int stuAverage = marksSum/stuMarks.length;
		for(int i=0; i<stuMarks.length; i++)
		{
			if(stuMarks[i]<stuAverage)
				System.out.print(i+" ");
		}
	}

}
