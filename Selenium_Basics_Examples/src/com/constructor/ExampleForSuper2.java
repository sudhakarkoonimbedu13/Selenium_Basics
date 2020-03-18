package com.constructor;

public class ExampleForSuper2 extends ExampleForSuper1{
	
   String color="Rose";
	
   ExampleForSuper2()
	{
	  super();
	  System.out.println("This is child class default constructor");
	}	
	
	public void display()
	{
	System.out.println(color);
	System.out.println(super.color);
	System.out.println(super.name);
	}
	
	public void m1()
	{
		System.out.println("This is m1 method overriden");
	}
	
	public void m2()
	{
		System.out.println("This is m2 method");
		super.m1();
		super.m3();
	}

	public static void main(String[] args) 
	{
		
		ExampleForSuper2 s1 = new ExampleForSuper2();
		s1.display();
		s1.m2();
	}

}
