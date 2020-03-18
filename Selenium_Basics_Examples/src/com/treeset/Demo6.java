package com.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class Demo6 
{

	public static void main(String[] args) 
	{
		TreeSet t1 = new TreeSet(new myComparator1());
		//TreeSet t1 = new TreeSet();
		
		t1.add(new StringBuffer("Z"));
		t1.add(new StringBuffer("X"));
		t1.add(new StringBuffer("A"));
		t1.add(new StringBuffer("Y"));
		t1.add(new StringBuffer("B"));
		
		System.out.println(t1);
	}

}

class myComparator1 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		return s1.compareTo(s2);
	}
}
