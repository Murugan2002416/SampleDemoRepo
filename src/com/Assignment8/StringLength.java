/**
 * 
 */
package com.Assignment8;

/**
 * program to print the length of the String
 * @author mkanakkanadar
 * 04/05/2023
 */
import java.util.Scanner;
public class StringLength { 
    public static void main(String[] args) { 
       Scanner read = new Scanner(System.in); 
 
        String str = read.next(); //Read the String from User 
 
        System.out.println("Length :"+str.length()); //Using String.length() to calculate the length of the string. 
 
        read.close(); 
} 
} 
 
