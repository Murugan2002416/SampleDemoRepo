/**
 * 
 */
package com.Assignment9;

/**
 * program to ask number names as input and display it using ArrayList.
 * @author mkanakkanadar
 * 05/05/2023
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;
public class ArrayListName {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Names");
		int nameCount = scan.nextInt();
		String nameArray[] = new String[nameCount];
		for(int i=0; i<nameCount; i++)
		{
			System.out.print("Given Name "+(i+1)+" ");
			nameArray[i] = scan.next();
		}
		
		ArrayList<String> name = new ArrayList<>();
		
        //convert array to arraylist
        Collections.addAll(name, nameArray);
        
       // Iterator itr = name.iterator();
        int count = 5;
         
        for(String s: name)
        {
        	if( s.length() > 5)
        	System.out.println(s);	 
        }
     	
	}

}
