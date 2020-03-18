package com.arraylist.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Demo6 {

	public static void main(String[] args) 
	{
		ArrayList l = new ArrayList();
        System.out.println(l.size());
        l.add("D");
        l.add("B");
        l.add("C");
        l.add("Z");
        System.out.println(l.size());
        System.out.println(l);
        
        Collections.sort(l,new MyComparator1()); // Customized Sorting Order
        
        System.out.println(l); 
        
        System.out.println(Collections.binarySearch(l,"Z",new MyComparator1())); // [Z, D, C, B] (Output: 0)
                                                                                 //  0  1  2  3 
        
                                                                                 // -1 -2 -3 -4 -5 (Insertion points)
        System.out.println(Collections.binarySearch(l,"a",new MyComparator1())); // [Z, D, C, B] (Output: -1)

	}

}

class MyComparator1 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		return s2.compareTo(s1);
	}
}
