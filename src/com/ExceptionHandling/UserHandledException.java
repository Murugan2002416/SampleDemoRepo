package com.ExceptionHandling;

public class UserHandledException {
	public static void main(String args[]) {
		try {
			int num = 23/0;
			System.out.println(num);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Welcome Mr.Stark");
		}
		System.out.print("Rest of the code");
	}

}
