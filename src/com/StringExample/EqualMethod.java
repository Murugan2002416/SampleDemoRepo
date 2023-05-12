package com.StringExample;

public class EqualMethod {
	public static void main(String args[]) {
		String str = "Welcome";
		String tr = "Welcome";
		String str1 = "Home";
		if(str.equals(tr))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		if(str==tr)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

}
