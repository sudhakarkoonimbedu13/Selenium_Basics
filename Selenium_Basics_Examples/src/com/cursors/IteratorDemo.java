package com.cursors;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

import org.openqa.selenium.WebElement;

public class IteratorDemo {

	public static void main(String[] args) 
	{
		Vector v = new Vector();
		
		v.add("A");
		v.add(10);
		v.add("B");
		v.add(20);
		v.add("C");
		v.add(30);
		
		Iterator it = v.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			it.remove();			
		}
		
		System.out.println(v.size());
		
		System.out.println(it.getClass().getName());

	}

}
