package com.arraylist.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Demo4 {

	public static void main(String[] args) 
	{
		ArrayList l = new ArrayList();
        System.out.println(l.size());
        l.add("Z");
        l.add("B");
        l.add("C");
        l.add("D");
        System.out.println(l.size());
        
        System.out.println("Before Sorting...."+l);
        
        Collections.sort(l, new MyComparator());
        
        System.out.println("After Sorting...."+l);

	}

}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
	  String s1 = obj1.toString();
	  String s2 = obj2.toString();
	  
	  return s2.compareTo(s1);
	}
}
