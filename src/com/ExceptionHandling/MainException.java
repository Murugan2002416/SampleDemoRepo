/**
 * 
 */
package com.ExceptionHandling;

/**
 * program to check for valid user name
 * @author mkanakkanadar
 * 04/05/2023
 */
class UserNameException extends Exception {
	public UserNameException(String s) {
		super(s);
	}
}
public class MainException  {
	public static void validUserName(String userName) throws UserNameException
	{
		int c1=0,c2=0;
		for(int i=0; i<userName.length(); i++) {
		 if(userName.contains("_") && userName.length()>7  )
		 {
			 if(userName.charAt(i)>96&&userName.charAt(i)<123) 
			 {
				 c1=1;
			 }
			 if(userName.charAt(i)>64&&userName.charAt(i)<91)
			 {
				 c2=1;
			 }
			 
				  
		 }
		}
			 if(c1==1 && c2==1)
				 System.out.println("Valid User Name");
		 else
			 throw new UserNameException("Please Enter a Valid User Name");
		
	}
	
	public static void main(String args[]) throws UserNameException {
		String str = "murugannn_";
		validUserName(str);
	}

}
