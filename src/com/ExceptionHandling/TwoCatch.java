/**
 * 
 */
package com.ExceptionHandling;

/**
 * @author mkanakkanadar
 *
 */
public class TwoCatch {
	public static void main(String args[]) {
		try {
			int arr[] = new int[4];
			arr[4] = 30/0;
			arr[9]=9;
			System.out.println(arr[9]);
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch( ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
	}

}
