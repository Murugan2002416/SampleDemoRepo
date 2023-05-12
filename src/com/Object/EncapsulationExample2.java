package com.Object;

public class EncapsulationExample2 {
	public static void main(String args[]) {
		 EncapsulationExample theatre = new EncapsulationExample();
		 theatre.setTheatreID(1002);
		 theatre.setTheatreName("INOX");
		 theatre.setTheatreTotalScreen(10);
		 theatre.setTheatreLocation("chennai");
		 System.out.println(" Theatre details ");
		 System.out.println("Theatre ID: "+theatre.getTheatreID());
		 System.out.println("Theatre Name: "+theatre.getTheatreName());
		 System.out.println("Theatre Total Screen: "+theatre.getTheatreTotalScreen());
		 System.out.println("Theatre Location: "+theatre.getTheatreLocation());
	 }

}
