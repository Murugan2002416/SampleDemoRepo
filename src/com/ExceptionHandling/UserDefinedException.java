/**
 * 
 */
package com.ExceptionHandling;

/**
 * program to show user defined exception
 * @author mkanakkanadar
 * 03/05/2023
 */
//User defined exception
public class UserDefinedException {
	public static void validate(int num) {
		if(num<0)
			throw new ArithmeticException("negative values are unacceptable");
		else
			System.out.print(num);
	}
	public static void main(String args[]) {
		try {
			validate(-10);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Out");
	}

}
