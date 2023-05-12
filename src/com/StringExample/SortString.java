/**
 * 
 */
package com.StringExample;

/**
 * program to sort a string using compareTo
 * @author mkanakkanadar
 * 03/05/2023
 */
public class SortString {
	public static void sortString(String str,String str1)
	{
		if(str.compareTo(str1)<0) // descending order
		{
            str.replace(str,str1);
		}
		System.out.println(str+" "+str1);
	}
	public static void main(String args[])
	{
		String str = "Murugan";
		String str1 = "manoj";
		sortString(str,str1);
	}

}
