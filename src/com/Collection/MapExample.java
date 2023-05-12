/**
 * 
 */
package com.Collection;

/**
 * program to understand Map
 * @author mkanakkanadar
 * 05/05/2023
 */
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class MapExample {
	public static void main(String args[]) {
		HashMap<String,Double> map = new HashMap<String,Double>();
		map.put("Joe Biden", 102.22);
		map.put("Donald Trump", 100.23);
		map.put("Brack Obama", 99.56);
		System.out.println(map);
		System.out.println(map.size());
		Set<Map.Entry<String,Double>> set = map.entrySet();
		System.out.println(set);
		
		for(Map.Entry<String, Double> temp : set)
		{
			System.out.println("Keys are: "+temp.getKey());
			System.out.println("Values are: "+temp.getValue());
			 
		}
		//want to print keys
		Set sss = map.keySet();
		System.out.println("Set only returns the keys"+sss);
		 
		//want to print the keys and values
		Set<Map.Entry<String, Double>> kkk = map.entrySet();
		System.out.println("Entry set will return the both keys and values"+kkk);
		
		map.remove("Donald Trump");
		map.put("Donald Trump", 200.80);
		System.out.println(map);
		map.remove("Brack Obama", 99.56);
		System.out.println(map);
		
		
	}

}
