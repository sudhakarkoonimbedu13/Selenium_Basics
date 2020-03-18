package com.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Demo3 
{

	public static void main(String[] args) 
	{
	   HashMap m = new HashMap();
	   
	   Integer i1 = new Integer(10);
	   Integer i2 = new Integer(10);
	   
	   System.out.println(i1==i2);
	   
	   System.out.println(i1.equals(i2));
	   
	   
	   m.put(i1, "Saravana");
	   m.put(i2, "Kandha");
	   
	   System.out.println(m);
	   
	   // Identity Hash Map (JVM will check the duplicate keys by using '==' method, where as in Hash Map JVM will check using equals() method)
	   IdentityHashMap m1 = new IdentityHashMap();
	   
	   m1.put(i1, "Saravana");
	   m1.put(i2, "Saravana");
	   
	   System.out.println(m1);

	}

}
