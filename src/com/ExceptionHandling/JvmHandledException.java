package com.ExceptionHandling;

public class JvmHandledException {
	public static void main(String args[])
	{
		try {
			int input = 25/0;
			System.out.println(input);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Exception is handled by the JVM so the remaining code can't be executed");
		}
		System.out.println("rest of the code");
	}

}
