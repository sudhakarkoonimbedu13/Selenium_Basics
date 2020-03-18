package com.navigableSetMap;

import java.util.TreeMap;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) 
	{
		TreeMap<String,String> t = new TreeMap<String,String>();
		
        t.put("A", "Apple");
        t.put("B", "Banana");
        t.put("C", "Cup");
        t.put("D", "Dog");
        t.put("E", "Egg");
        t.put("F", "Fish");
		
		System.out.println(t);
		
		System.out.println(t.lowerKey("C"));
		
		System.out.println(t.floorKey("C"));
		
		System.out.println(t.higherKey("C"));
		
		System.out.println(t.ceilingKey("C"));
		
		System.out.println(t.pollFirstEntry());
		
		System.out.println(t.pollLastEntry());
		
		System.out.println(t.descendingMap());
		
		System.out.println(t);

	}

}
