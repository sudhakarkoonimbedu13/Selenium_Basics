package com.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class Demo7 {

	public static void main(String[] args) 
	{
		TreeSet t1 = new TreeSet(new myComparator2());
		
		t1.add("A");
		t1.add("AA");
		t1.add(new StringBuffer("XX"));
		t1.add("ABC");
		t1.add(new StringBuffer("ABCDE"));
		
		System.out.println(t1);
	}

}

class myComparator2 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
	   String s1 = obj1.toString();
	   String s2 = obj2.toString();
	   
	   int l1 = s1.length();
	   int l2 = s2.length();
	   
	   if(l1>l2)
	   {
		  return +1;
	   }
	   else if(l1<l2)
	   {
		   return -1;
	   }
	   else
	   {
		  return s1.compareTo(s2);
	   }
	}
}
