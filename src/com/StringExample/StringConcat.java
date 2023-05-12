/**
 * 
 */
package com.StringExample;

/**
 * @author mkanakkanadar
 *
 */
public class StringConcat {
	public static void main(String args[]) {
		String str = "Always"+"Cool";
		System.out.println(str);
		String str1 = "Point";
		String str2 = "Break";
		System.out.println(str1.concat(str2));//concat method used
		String str3 = 2500+500+" I am"+" Inevitable"+2+7000;//after the string first number is taken as a character then it will be String next num will be treated as a char
		System.out.println(str3);
	}

}
