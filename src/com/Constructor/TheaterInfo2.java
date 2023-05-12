package com.Constructor;

import com.Constructor.TheaterInfo;

public class TheaterInfo2 {
	public static void main(String args[]) {
		TheaterInfo obj = new TheaterInfo();
	     //No Argument Constructor
		obj.getTheaterInfo();
		
		// one argument constructor
		TheaterInfo obj1 = new TheaterInfo(150);
		obj1.getTheaterInfo();
		
		//Two argument constructor
		TheaterInfo obj2 = new TheaterInfo(150,3);
		obj2.getTheaterInfo();
		
		//Three argument constructor
		TheaterInfo obj3 = new TheaterInfo(200,6,"APA");
		obj3.getTheaterInfo();
		
		//Four Argument Constructor
		TheaterInfo obj4 = new TheaterInfo(500,8,"SARVAM","LOVE TODAY");
		obj4.getTheaterInfo();
		
		
		
	}

}
