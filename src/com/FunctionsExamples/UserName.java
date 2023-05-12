/**
 * 
 */
package com.FunctionsExamples;

/**
 * program to use functions
 * @author mkanakkanadar
 * 26/04/2023
 */
class UserFriend {
	public static String printMessage(String name)
	{
		return name;
	}
}
public class UserName {
	public static void main(String args[]) {
		String name;
		name = "Murugan";
		System.out.print(UserFriend.printMessage(name));
		
	}

}
