/**
 * 
 */
package com.StringExample;

/**
 * program to use 
 * @author mkanakkanadar
 *
 */
public class CompareMethod {
	public static int compareMethod(String str1,String str2)
	{
		String st = str1;
		String sr = str2;
		return st.compareTo(sr);
	}
 public static void main(String args[])
 {
	 String ch = "Murugan";
	 String ch1 = "Murugan";
	 System.out.println(compareMethod(ch,ch1));
 }
}
