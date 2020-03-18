package com.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo 
{

	public static void main(String[] args) 
	{
		Vector v = new Vector();
		
		v.add("A");
		v.add(10);
		v.add("B");
		v.add(20);
		v.add("C");
		v.add(30);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
		   System.out.println(e.nextElement());
		}
		
		System.out.println(e.getClass().getName());
	}

}
