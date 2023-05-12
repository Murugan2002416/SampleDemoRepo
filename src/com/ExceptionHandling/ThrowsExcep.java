/**
 * 
 */
package com.ExceptionHandling;

/**
 * @author mkanakkanadar
 *
 */
public class ThrowsExcep {
	public static void main(String args[]) {
			try {
		      String str = null;
		      int s=6/0;
		      System.out.println(s);
			}
			catch(Exception e) {
				System.out.println(e );
			}
			System.out.println("rest of the code");
			}

}
