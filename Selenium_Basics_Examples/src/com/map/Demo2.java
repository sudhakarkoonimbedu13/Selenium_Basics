package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo2 
{

	public static void main(String[] args) 
	{
		HashMap m = new HashMap();
		
		m.put("Govindha",200);
		m.put("Baba", 300);
		m.put("Sai",100);
		m.put("Arul",150);
		
		System.out.println(m);
		
		LinkedHashMap m1 = new LinkedHashMap();
		
		m1.put("Govindha",200);
		m1.put("Baba", 300);
		m1.put("Sai",100);
		m1.put("Arul",150);
		
		System.out.println(m1);

	}

}
