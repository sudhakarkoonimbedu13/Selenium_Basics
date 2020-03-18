package com.staticinstanceblock;

public class Example1 {
	
	static int i;
	
	static
	{
		i=10;
		System.out.println(i);
	}
	
	static void m1()
	{
		System.out.println("This is m1 static method");
	}
	
	public static void main(String[] args)
	{
		
	}
}
