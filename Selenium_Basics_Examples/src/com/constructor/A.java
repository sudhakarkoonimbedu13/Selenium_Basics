package com.constructor;

class A {
	
	A()
	{
		System.out.println("This is the default constructor");
	}
	
	A(int i,int j)
	{
		this(10,20,30);
		int k=i+j;
		System.out.println(k);
		System.out.println("This is the two arguments constructor");
	}
	
	A(int i,int j,int k)
	{
		this();
		int w=i+j+k;
		System.out.println(w);
		System.out.println("This is the three arguments constructor");
	}
}
