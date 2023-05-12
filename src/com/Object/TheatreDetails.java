/**
 * 
 */
package com.Object;

/**
 * program to display multiple objects 
 * @author mkanakkanadar
 * 27/04/2023
 */
import java.util.Scanner;
 class MovieDetails {
		private String theatreName;
		private int ticketNo;
		private String movieName;
		private int seatNo;
		
		public void setMovieDetails(String theatrename , int ticketno , String moviename, int seatno) {
			theatreName = theatrename;
			ticketNo = ticketno;
			movieName = moviename;
			seatNo = seatno;
		}
		public void getMovieDetails() {
			System.out.print("Theatre name: "+theatreName+" Ticket No: "+ticketNo+" Movie name: "+movieName+" Seat No: "+seatNo);
		}

	}
public class TheatreDetails {
	public static void main(String args[]) {
		MovieDetails movieObject[] = new MovieDetails[3];
		int ticketNO,seatNO;
		String theatreNAME,movieNAME;
		for(int i=0; i<3; i++)
		{
			movieObject[i] = new MovieDetails();
		}
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter Movie Details: "+(i+1));
			System.out.print("Enter the Theatre Name");
			theatreNAME = scan.next();
			System.out.println("Enter the Movie Name");
			movieNAME = scan.next();
			System.out.println("Enter the Ticket Number");
			ticketNO = scan.nextInt();
			System.out.println("Enter the Seat Number");
			seatNO = scan.nextInt();
			movieObject[i].setMovieDetails(theatreNAME, ticketNO, movieNAME,seatNO );
		}
		
		for(int i=0; i<3; i++)
		{
			movieObject[i].getMovieDetails();
		}
	}
}

