package map;

import java.util.HashMap;

public class Hash_Map {
	
	public static void main(String[] args) {
		
		/*
		 * HashMap provides the basic implementation of Map interface
		 * It stores data in key and Value pairs
		 * We can access a value using the corresponding key
		 * Methods : put, get, containsKey, remove, clear, keySet, values, enterySet
		 */
		
		var map = new HashMap<Integer,String>();
		
		map.put(1, "Jan");
		map.put(2, "Feb");
		map.put(3, "Mar");
		map.put(4, "Apr");
		map.put(5, "May");
		
		System.out.println(map.get(2));
		System.out.println(map.get(44));
		System.out.println(map.containsKey(3));
		
		map.put(4, "Dec");
		
		//map.remove(4);
		//map.remove(5, "May");
		//map.clear();
		
		var set1 = map.keySet();
		
		var set2 = map.values();
		
		var set3 = map.entrySet();
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		System.out.println(map);
	}

}
