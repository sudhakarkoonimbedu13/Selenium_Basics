package com.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class Demo5 
{

	public static void main(String[] args) 
	{
		TreeSet t1 = new TreeSet(new myComparator());
		
		t1.add("Sai");
		t1.add("Shiva");
		t1.add("Saravanabava");
		t1.add("Ganapathy");
		t1.add("Balaji");
		
		System.out.println(t1);
	}

}

class myComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1 = (String)obj1;
		String s2 = obj2.toString();
		
		return s2.compareTo(s1);
	}
}
