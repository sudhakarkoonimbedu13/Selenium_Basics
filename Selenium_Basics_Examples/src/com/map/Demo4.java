package com.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Demo4 
{
    public String toString()
    {
    	return "temp";
    }
    
    public void finalize()
    {
    	System.out.println("This is Finalized method");
    }
    
	public static void main(String[] args) throws InterruptedException 
	{
		HashMap m = new HashMap();
		
		Demo4 t1 = new Demo4();
		
		m.put(t1, "Sai");
		
		System.out.println(m);
		
		t1 = null;
		
		System.gc();
		
		Thread.sleep(5000);
		
		System.out.println(m);
		
		System.out.println("********Weak HashMap******************************");
		
		WeakHashMap m1 = new WeakHashMap();
		
		Demo4 t2 = new Demo4();
		
		m1.put(t2, "Sai");
		
		System.out.println(m);
		
		t2 = null;
		
		System.gc();
		
		Thread.sleep(5000);
		
		System.out.println(m1);
		

	}

}
