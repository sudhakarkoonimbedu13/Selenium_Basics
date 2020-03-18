package com.vector;

import java.util.Vector;

public class Demo1 {

	public static void main(String[] args) 
	{
		Vector v = new Vector(24);
		
		v.addElement("Test1");
		v.add(1, "Test2");
		v.add("Test3");
		
		v.removeElement("Test1");
		v.removeElementAt(1);
		
		System.out.println(v.size());
		
		v.clear();
		
		System.out.println(v.size());
		
		System.out.println(v.capacity());

	}

}
