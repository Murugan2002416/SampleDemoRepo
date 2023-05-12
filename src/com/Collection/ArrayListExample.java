/**
 * 
 */
package com.Collection;

/**
 * @author mkanakkanadar
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ArrayListExample {
	public static void main(String args[]) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(12);
		array.add(45);
		array.add(76);
		array.add(100);
		array.add(89);
		System.out.println(array);
		
		array.add(4,200);
		System.out.println(array);
		
		//to add an  list into arraylist
		List<Integer> array1 = new ArrayList();
		array1.add(23);
		array1.add(12);
		array.addAll(1,array1);
		System.out.println(array);
		
		System.out.println(array.size());
		
		array.remove(0);
		
		System.out.println(array);
		array.add(0,100);
		System.out.println(array);
		System.out.println(array.size());
		
		if(array.contains(100))
			System.out.println("One Zero Zero");
		else
			System.out.println("OOPS!");
		
		if(array.containsAll(array1))
			System.out.println("Collection is present");
		else
			System.out.println("Your Not Added the Array1 List");
		
		System.out.println(array.get(6));
		
		System.out.println(array.lastIndexOf(100));
		
		array.set(1, 33);
		
		System.out.println(array);
		//System.out.println(array.retainAll(array1));
		System.out.println(array);
		
		//Iterator
		Iterator<Integer> itr = array.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next() + " ");
		}
		
		List<Integer> l = array.subList(2, 8);
		System.out.println(l);
		
		//Collections.reverse( array);
		Collections.sort(array,Collections.reverseOrder());
		System.out.println(array);
 		
	}

}
