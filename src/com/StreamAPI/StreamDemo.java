/**
 * 
 */
package com.StreamAPI;

import java.util.*;
import java.util.stream.Stream;
/**
 * @author mkanakkanadar
 *
 */
//import java.util.stream.*;
public class StreamDemo {
	public static void main(String args[]) {
	Integer[] number = new Integer[] {1,2,3,3,4,4,5,6,7};
	
	int count = (int)Arrays.stream(number).distinct().count();
	System.out.println("Count "+count);
	
	Stream<Integer> streamArray = Stream.of(number);
	streamArray.forEach(s->System.out.print(s+"\t"));
	
	Collection
	
	
	}
}
