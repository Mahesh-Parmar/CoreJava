package sets;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		
		/*
		 * TreeSet is an important implementation of the SortedSet interface
		 * Elements are sorted in ascending order by default
		 * No positional access of elements
		 * Basic Methods : add, remove, clear, contains, size,
		 * IMP : Union and Intersection of Set
		 * IMP : Convert set to list
		 */
		
		Set<String> set1 = new TreeSet<String>();
		
		set1.add("Mahesh");
		set1.add("Ramesh");
		set1.add("Suresh");
		set1.add("Ahaaha");
		
		System.out.println(set1);
		
		var set2 = new TreeSet<Integer>();
		
		set2.add(100);
		set2.add(10);
		set2.add(50);
		set2.add(2);
		set2.add(0);
		
		System.out.println(set2);

	}

}
