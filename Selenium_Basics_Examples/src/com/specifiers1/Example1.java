package com.specifiers1;

public class Example1 {
	
	int i=10;              // default access specifier
	public int j=20;       // public access specifier
	private int k=30;      // private access specifier
	protected int l=40;    // protected access specifier 
	
	void m1()  // default access specifier
	{
		System.out.println("This is the default method");
	}
	
	public void m2()  // public access specifier
	{
		System.out.println("This is the public method");
	}
	
	private void m3()  // private access specifier
	{
		System.out.println("This is the private method");
	}
	
	protected void m4()  // protected access specifier
	{
		System.out.println("This is the protected method");
	}
	
	protected Example1()  // default access specifier
	{
		//this(10,20);
		System.out.println("This is the default constructor");
	}
	
	public Example1(int a,int b)  // public access specifier
	{
		//this(10,20,30);
		System.out.println("This is the public constructor");
	}
	
	private Example1(int a,int b,int c)  // private access specifier
	{
		//this("Sai","Ram");
		System.out.println("This is the private constructor");
	}
	
	Example1(String s1,String s2)  // default access specifier
	{
		System.out.println("This is the protected constructor");
	}
	
	public static void main(String[] args) {
		
		// We can access all the constructors even though declared as private,default and protected
		Example1 obj1 = new Example1();
		Example1 obj2 = new Example1(10,20);
		Example1 obj3 = new Example1(10,20,30);
		Example1 obj4 = new Example1("Sai","Ram");
		
		// We can access all the variables even though declared as private,default and protected 
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		System.out.println(obj1.k);
		System.out.println(obj1.l);
		
		// We can access all the methods even though declared as private,default and protected
		obj1.m1();
		obj1.m2();
		obj1.m3();
		obj1.m4();		

	}

}
