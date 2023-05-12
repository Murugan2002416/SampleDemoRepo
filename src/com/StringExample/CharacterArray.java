package com.StringExample;

public class CharacterArray {
	public static void main(String args[])
	{
		String str = "Welcome";
		char ch[] = str.toCharArray();
		for(int i=0; i<str.length(); i++)
		{
			System.out.println(ch[i]);
		}
	}
}
