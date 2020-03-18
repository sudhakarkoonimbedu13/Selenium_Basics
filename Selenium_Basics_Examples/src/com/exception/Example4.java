// By default un-checked exception forwarded in chain (Propagated)

package com.exception;

import java.io.IOException;

public class Example4 {

	String s1=null;
	
	public void m1()
	{
		System.out.println(s1.length());
	}
	
	public void m2()
	{
		m1();
	}
	
	public void m3()
	{
		try
		{
		  m2();
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception handled via Exception Propagation");
		}
	}
	
	
	public static void main(String[] args) 
	{
		Example4 s1 = new Example4();
		s1.m3();
	}

}
