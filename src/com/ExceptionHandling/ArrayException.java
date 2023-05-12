package com.ExceptionHandling;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int arr[] = new int[0];
		arr[0] = 2;
		arr[1] = 3;
		System.out.print(arr);
		}
		finally
		{
			System.out.println("HEllo");
		}
		 
		System.out.println("out of the loop");

	}

}
