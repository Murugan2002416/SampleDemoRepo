/**
 * 
 */
package com.Constructor;

/**
 * program to use constructors
 * @author mkanakkanadar
 * 27/04/2023
 */
public class TheaterInfo {
	  
	private int ticketCost;
	private int seatNo;
	private String theaterName;
	private String movieName;
	
	 public TheaterInfo()
	{
		ticketCost = 150;
		seatNo = 3;
		theaterName = "APA";
		movieName = "MissionImpossible";
	}
	 public TheaterInfo(int ticketcost)
	 {
		 ticketCost = ticketcost;
	 }
	 public TheaterInfo(int ticketcost, int seatno)
	 {
		 ticketCost = ticketcost;
		 seatNo = seatno;
	 }
	 
	 public TheaterInfo(int ticketcost, int seatno, String theatername)
	 {
		 ticketCost = ticketcost;
		 seatNo = seatno;
		 theaterName = theatername;
	 }
	 public TheaterInfo(int ticketcost, int seatno, String theatername, String moviename)
	 {
		 ticketCost = ticketcost;
		 seatNo = seatno;
		 theaterName = theatername;
		 movieName = moviename;
	 }
	public void getTheaterInfo()
	{
		System.out.println("Ticket Cost "+ticketCost+" Seat Number "+seatNo+" TheaterName "+theaterName+" MovieName "+movieName);
	}
	
}

