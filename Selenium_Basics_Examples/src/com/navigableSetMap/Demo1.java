package com.navigableSetMap;

import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) 
	{
		TreeSet<Integer> t = new TreeSet<Integer>();
		
		t.add(1000);
		t.add(2000);
		t.add(3000);
		t.add(4000);
		t.add(5000);
		t.add(6000);
		t.add(7000);
		t.add(8000);
		
		System.out.println(t);
		
		System.out.println(t.lower(3000));
		
		System.out.println(t.floor(3000));
		
		System.out.println(t.higher(3000));
		
		System.out.println(t.ceiling(3000));
		
		System.out.println(t.pollFirst());
		
		System.out.println(t.pollLast());
		
		System.out.println(t.descendingSet());
		
		System.out.println(t);
		
	}

}
