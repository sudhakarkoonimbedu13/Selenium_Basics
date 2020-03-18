package com.constructor;

public class ExampleForSuper1 {
	
	String color="White";
	String name="Sai";
	
	public void m1()
	{
		System.out.println("This is m1 method");
	}
	
	public static void m3()
	{
		System.out.println("This is m3 method");
	}
	
	ExampleForSuper1()
	{
		this(10,20);
		System.out.println("This is default constructor");
	}
	
	ExampleForSuper1(int i,int j)
	{
		this(10,20,30);
		System.out.println("This is the two argument constructor");
	}
	
	ExampleForSuper1(int i,int j,int k)
	{
		System.out.println("This is the three argument constructor");
	}	
}

