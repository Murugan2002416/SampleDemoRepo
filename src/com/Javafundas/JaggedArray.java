/**
 * 
 */
package com.Javafundas;

/**
 * @author mkanakkanadar
 *
 */
 class InstantiateTwodArray {
	public static void main(String args[]) {
		int[][] arrayNo = new int[3][];
		arrayNo[0] = new int[]{1,2,3};
		arrayNo[1] = new int[]{2,34,5,6};
		arrayNo[2] = new int[]{2,3};
		
		for(int i=0; i<arrayNo.length; i++)
		{
			for(int j=0; j<arrayNo[i].length; j++)
			{
				System.out.print(arrayNo[i][j]+" ");
			}
			System.out.println();
		}
	}
}
