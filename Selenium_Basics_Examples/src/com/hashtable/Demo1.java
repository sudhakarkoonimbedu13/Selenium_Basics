package com.hashtable;

import java.util.Hashtable;

class Demo1 
{
    int i;
    
	Demo1(int i)
	{
		this.i=i;
	}
	
	public int hashCode()
	{
		return i;
	}
	
	public String toString()
	{
		return i+"";
	}
	
	public static void main(String[] args)
	{
		Hashtable t = new Hashtable(25);
		
		t.put(new Demo1(5), "A");
		t.put(new Demo1(6), "B");
		t.put(new Demo1(8), "D");
		t.put(new Demo1(15), "E");
		t.put(new Demo1(23), "F");
		t.put(new Demo1(16), "G");
		
		System.out.println(t);
		
		Hashtable t1 = new Hashtable();
		
		t1.put(new Demo1(5), null);
		
		System.out.println(t1);
		
	}
}


