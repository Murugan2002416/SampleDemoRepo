/**
 * 
 */
package com.StringExample;

import java.util.Arrays;

/**
 * program to check the two strings are anagram are not
 * @author mkanakkanadar
 * 03/05/2023
 */
public class AnagramSting {
	public static void main(String args[]) {
		String str1 = "silent";
		String str2 = "listen";
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String word1 = new String(arr1);
		String word2 = new String(arr2);
		if(word1.equals(word2))
			System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not a anagram");
			
	}

}
