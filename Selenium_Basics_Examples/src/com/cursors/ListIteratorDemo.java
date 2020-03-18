package com.cursors;

import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class ListIteratorDemo {

	public static void main(String[] args) 
	{
		Vector v = new Vector();
		
		v.add("A");
		v.add(10);
		v.add("B");
		v.add(20);
		v.add("C");
		v.add(30);
		
		System.out.println(v);
		
		ListIterator listItr = v.listIterator();
		
		while(listItr.hasNext())
		{
			String str1 = (String)listItr.next();			
			System.out.println(listItr.nextIndex()+" :"+listItr.next());
			
			if(str1.length()>1)
			{
				listItr.remove();
			}
		}
		
		System.out.println(v);
		
		System.out.println(listItr.getClass().getName());
	}

}
