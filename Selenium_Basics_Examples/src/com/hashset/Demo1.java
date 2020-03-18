package com.hashset;

import java.util.HashSet;

public class Demo1 
{

	public static void main(String[] args) 
	{
		HashSet h = new HashSet(); // Default initial capacity is : 16 and default Fill Ratio (or) Load Factor is : 0.75
		
		// HashSet h1 = new HashSet(20);
		
		// HashSet h2 = new HashSet(int initialCapacity, float 0.9f);
		
		// HashSet h3 = new HashSet(collection c);
		
		
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
