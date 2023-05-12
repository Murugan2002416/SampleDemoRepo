package com.Collection;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String args[])
	{
		HashSet<String> hash = new HashSet<String>();
		hash.add("alpha");
		hash.add("beta");
		hash.add("gamma");
		hash.add("omega");
		hash.add("epsilon");
		hash.add("alpha");
		System.out.println(hash);
		System.out.println("Size of Hash: "+hash.size());
		
	}

}
