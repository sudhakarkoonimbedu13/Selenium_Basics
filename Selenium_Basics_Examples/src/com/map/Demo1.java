package com.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) 
	{
		HashMap m = new HashMap(); //[Default Initial Capacity - 16 and Default Fill Ration - 0.75]
		//HashMap m = new HashMap(10);
		//HashMap m = new HashMap(10,0.9f);
		//HashMap m = new HashMap(Map m);
		
		System.out.println(m.put(101, "Sai"));
		System.out.println(m.put(102, "Shiva"));
		System.out.println(m.put(103, "Saravanabava"));
		System.out.println(m.put(103, "Muruga")); //[Replaces old with new value and returns old value]
		
		System.out.println(m);
		
		System.out.println("*****************Keys*******************************");
		Set s1 = m.keySet();
		
		System.out.println(s1);
		System.out.println("***************************************************");
		
		System.out.println("*****************Values*******************************");
		Collection s2 = m.values();
		
		System.out.println(s2);
		System.out.println("******************************************************");
		
		System.out.println("*****************Entry Sets*******************************");
		Set s3 = m.entrySet();
		
		System.out.println(s3);
		
		Iterator it = s3.iterator();
		while(it.hasNext())
		{
			Map.Entry m1 = (Map.Entry)it.next();
			System.out.println(m1.getKey()+"....."+m1.getValue());
			if(m1.getValue()=="Muruga")
			{
				m1.setValue("Kandhaswamy");
			}
		}
		
		System.out.println(m);
		
		System.out.println("******************************************************");
		
		Map m1 = Collections.synchronizedMap(m);
	}

}
