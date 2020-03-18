package com.treemap;

import java.util.Comparator;
import java.util.TreeMap;

class Demo1 
{

	public static void main(String[] args) 
	{
	   	 
       TreeMap t1 = new TreeMap();
       
       // TreeMap t2 = new TreeMap(Comparator c);
       
       // TreeMap t3 = new TreeMap(Map m);
       
       // TreeMap t4 = new TreeMap(SortedMap m);
       
       t1.put(101, "A");
       t1.put(102, "B");
       t1.put(104, "D");
       t1.put(103, "C");
       t1.put(105, 106);
       
       System.out.println(t1);
       
       System.out.println("*******************Customized Sorted Map****************************");
       
       TreeMap t2 = new TreeMap(new comparator());
       
       t2.put(101, "A");
       t2.put(102, "B");
       t2.put(104, "D");
       t2.put(103, "C");
       t2.put(105, 106);
       
       System.out.println(t2);
       
	}

}


class comparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		return s2.compareTo(s1);
	}
}
