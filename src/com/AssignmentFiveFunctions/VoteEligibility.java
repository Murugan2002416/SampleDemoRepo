/**
 * 
 */
package com.AssignmentFiveFunctions;

/**
 * program to check the vote eligibility
 * @author mkanakkanadar
 * 26/04/2023
 */
public class VoteEligibility {
	public static boolean isValidAge(int personAge)
	{
		if(personAge>=1)
			return true;
		else
			return false;
	}
	public static void isEligible(int personAge)
	{
		if(personAge>=18)
			System.out.println("Person is Eligible to Vote");
		else
			System.out.print("Person is Not Eligible to Vote");
	}
	public static void main(String args[]) {
		int personAge = 19;
		 if(isValidAge(personAge))
			 isEligible(personAge);
		 else
			 System.out.println("Enter the Valid Age");
	}

}