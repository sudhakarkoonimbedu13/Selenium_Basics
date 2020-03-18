package com.arraylist.com;

import java.util.ArrayList;
import java.util.Collections;

public class Demo7 {

	public static void main(String[] args) 
	{
		ArrayList l = new ArrayList();
        System.out.println(l.size());
        l.add("Z");
        l.add("B");
        l.add("C");
        l.add("D");
        
        System.out.println(l);
        
        Collections.reverse(l);
        
        System.out.println(l);
        
    }

}
