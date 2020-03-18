package com.staticinstanceblock;

public class Example3 {
	
	static int i=20;
	
	static
	{
		m1();
		System.out.println("First Static Block");
	}

	public static void main(String[] args) 
	{
		m1();
		System.out.println("Main Method");		
	}
	
	public static void m1()
	{
		
		System.out.println(i);
		System.out.println(j);
	}
	
	static
	{
		System.out.println("Second Static Block");
	}
	
	static int j=40;

}
