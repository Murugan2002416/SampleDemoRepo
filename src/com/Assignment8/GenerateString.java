/**
 * 
 */
package com.Assignment8;

/**
 * @author mkanakkanadar
 *
 */
public class GenerateString {
	public static void main(String args[]) {
		String str1 = "Tony";
		String str2 = "Stark";
	    char ch[] = str1.toCharArray();
	    StringBuffer sb = new StringBuffer(" ");
	    
	    for(int i=0; i<ch.length; i++)
	    {
	    	if(i%2==1)
	    		 sb.append(str2);
	    	else
	    		 sb.append(ch[i]);
	    }
	    System.out.println(sb);
		 
	    
	    String str3 = "Criteria";
	    String str4 = "ri";
	    StringBuffer sv = new StringBuffer(str3);
        int firstOccurrence = str3.indexOf(str4);
        int secondOccurrence = str3.lastIndexOf(str4);
         
	     if(firstOccurrence!=secondOccurrence)
	     {
    	 
	    	  sv.replace(secondOccurrence,secondOccurrence+2,new String(new StringBuffer(str4).reverse()));
	    	  System.out.println(sv);
	     }
	     else
	    	 System.out.println(str3+""+str4);
        //sv.replace(firstOccurrence,secondOccurrence,new String(new StringBuffer(str4).reverse()));
	     
	    
	     
	     String str5 = "criteria";
	     String str6 = "ri";
	     int firstAppearance = str5.indexOf(str6);
	     int secondAppearance = str5.lastIndexOf(str6);
	     StringBuffer sw = new StringBuffer(str5);
	     if(firstAppearance!=secondAppearance)
	     {
	    	 sw.delete(firstAppearance, firstAppearance+2);
	    	 System.out.println(sw);
	     }
	     else
	    	 System.out.println(str5);
	     
	     String str7 = "criteria";
	     String str8 = "cri";
	     StringBuffer sq = new StringBuffer(str7);
	     
	     
	    
	}

}
