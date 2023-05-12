/**
 * 
 */
package com.Javafundas;
import java.util.Scanner;

/**
 * @author mkanakkanadar
 *
 */
public class GroupSelection {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int ticketNo = scan.nextInt();
		scan.close();
		if(ticketNo%10==0)
			System.out.println("Group Leader");
		else
			System.out.println("Group Member");
	}

}
