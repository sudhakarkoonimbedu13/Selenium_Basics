package com.staticinstanceblock;

public class Example2 {
	
	static int i=10;
	int j=30;
	
	static
	{
		i=20;
	   // j=40; //can't access non static variable in static block 
	}
	
	{
		System.out.println(j);
		System.out.println("This is first instance block");
	}
	
	// Note: The static variables and methods can be accessible from non-static method, but vice-versa is not allowed.
	public static void m1()
	{
		System.out.println(i);
		// System.out.println(j); // can't access non static variable in static method
		System.out.println("This is static method");
		// m2();
	}
	
	public void m2()
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println("This is non-static method");
		m1();
	}
	
	Example2()
	{
		System.out.println("This is default constructor");
	}
	
	public static void main(String[] args)
	{
		System.out.println(i);
		//System.out.println(j);
		
		m1();
		//m2();
		
		Example2 s1 = new Example2();
		System.out.println(s1.i);
		System.out.println(s1.j);
		
		s1.m1();
		s1.m2();
		
		Example1.m1();
	}

}
