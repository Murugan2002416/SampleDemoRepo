/**
 * 
 */
package com.ExceptionHandling;

/**
 * @author mkanakkanadar
 *
 */
class InvalidAgeException extends Exception {
	public  InvalidAgeException(String s) {
		super(s);
	}
}
public class UserException {
	public static void checkVoteEligibility(int age) throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("Still "+(18-age)+" ages are there");
		else
			System.out.println("Eligible to vote");
		
	}
	public static void main(String args[]) throws InvalidAgeException
	{
		// this command used lines code that are exception handled by JVM
//		int age = 16;
//		checkVoteEligibility(age);
		try {
			int age = 16;
			checkVoteEligibility(age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
	}

}
