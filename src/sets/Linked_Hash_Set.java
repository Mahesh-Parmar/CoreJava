package sets;

import java.util.LinkedHashSet;

public class Linked_Hash_Set {

	public static void main(String[] args) {
		/*
		 * A LinkedHashSet is an ordered version of HashSet
		 * LinkedHashSet maintains a doubly-linked List across all element
		 * No positional access of elements
		 * Basic Methods : add, remove, clear, contains, size
		 * IMP : Union and Intersection of Set
		 * IMP : Convert set to list
		 */
		
		LinkedHashSet list1 = new LinkedHashSet<Character>();
		
		list1.add('a');
		list1.add('e');
		list1.add('i');
		list1.add('o');
		list1.add('u');
		System.out.println(list1);

	}

}
