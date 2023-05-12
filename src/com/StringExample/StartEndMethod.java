package com.StringExample;

public class StartEndMethod {
	public static void main(String args[]) {
		String str = "Tell them all";
		System.out.println(str.startsWith("Tell"));
		System.out.println(str.endsWith("ll"));
		System.out.println(str.endsWith("LL"));
		System.out.println(str.equalsIgnoreCase());
	}

}
