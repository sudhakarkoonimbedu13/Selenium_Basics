// By default checked exception not forwarded in chain (Not Propagated)

package com.exception;

import java.io.IOException;

public class Example5 {

	public void m1()
	{
		//throw new java.io.IOException("device error");
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
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
	}
	
	
	public static void main(String[] args) 
	{
		Example5 s1 = new Example5();
		s1.m3();
	}

}
