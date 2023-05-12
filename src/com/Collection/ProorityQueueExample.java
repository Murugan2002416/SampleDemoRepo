/**
 * 
 */
package com.Collection;

/**
 * @author mkanakkanadar
 *
 */
import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Collections;
public class ProorityQueueExample {
	public static void main(String[] args) {
                     PriorityQueue<String> pq = new PriorityQueue(10,Collections.reverseOrder()); // iterates in a reverse order
                     pq.add("Murugan");
                     pq.add("Manojh");
                     pq.add("Madesh");
                     pq.add("Barath");
                     
                     Iterator<String> itr = pq.iterator();
                     while(itr.hasNext())
                     {
                    	 System.out.println(itr.next());
                     }
                   //  System.out.println(pq);
                     pq.poll();
                     System.out.println(pq);
                     System.out.println(pq.peek());
                     pq.offer("maddy");
                     System.out.println(pq);
                     System.out.println(pq.element());
}
}
