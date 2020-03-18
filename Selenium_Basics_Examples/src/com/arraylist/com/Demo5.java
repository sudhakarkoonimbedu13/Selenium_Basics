package com.arraylist.com;

import java.util.ArrayList;
import java.util.Collections;

public class Demo5 {

	public static void main(String[] args) 
	{
      
		ArrayList l = new ArrayList();
        System.out.println(l.size());
        l.add("Z");
        l.add("B");
        l.add("C");
        l.add("D");
        System.out.println(l.size());
        System.out.println(l);
        
        //Collections.sort(l); // Default Natural Sorting Order
        
        System.out.println(l); 
        
        System.out.println(Collections.binarySearch(l,"Z")); // [B,C,D,Z] (Output: 3)
                                                             //  0 1 2 3 
        
                                                             // -1 -2 -3 -4 -5 (Insertion points)
        System.out.println(Collections.binarySearch(l,"a")); // [B,C,D,Z] (Output: -5)


	}

}
