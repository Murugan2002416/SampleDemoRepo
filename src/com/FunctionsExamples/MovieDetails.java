/**
 * 
 */
package com.FunctionsExamples;

/**
 * @author mkanakkanadar
 *
 */
public class MovieDetails {
	public static void printMovieDetails(String title,String description,int duration, String language, String date, String country, String genre)
	{
		String n = System.lineSeparator();
		String movieTitle=title,movieDescription=description,movieLanguage=language,movieDate=date,movieCountry=country,movieGenre=genre;
		int movieDuration=duration;
		System.out.println("Movie title: "+movieTitle+n+"Movie description: "+movieDescription+n+"Movie duration: "+movieDuration+n+"Movie language: "+movieLanguage+n+"Movie release date: "+movieDate+n+"Movie country: "+movieCountry+n+"Movie genre: "+movieGenre);
	}
	public static void main(String args[]) {
		printMovieDetails("AAA","Dramaof1945",3,"English","26/04/2023","XYZ","Action");
		
	}

}
