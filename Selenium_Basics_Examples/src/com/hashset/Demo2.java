// Duplicates are not allowed and insertion order should be preserved. Because the underline data structure is "Linked List + Hash Table"
// The Linked Hash Set is best useful for developing cache based applications.

package com.hashset;

import java.util.LinkedHashSet;

public class Demo2 {

	public static void main(String[] args) 
	{
		LinkedHashSet h = new LinkedHashSet();
		
		h.add("G");
		h.add("D");
		h.add("A");
		h.add("B");
		h.add(null);
		
		System.out.println(h.add("A"));
		System.out.println(h.add("A"));
		
		System.out.println(h);

	}

}
