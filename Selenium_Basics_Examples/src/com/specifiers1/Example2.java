package com.specifiers1;

public class Example2 {

	public static void main(String[] args) 
	{
		// We can access all the constructors except private
		Example1 obj1 = new Example1();
		Example1 obj2 = new Example1(10,20);
		//Example1 obj3 = new Example1(10,20,30);
		Example1 obj4 = new Example1("Sai","Ram");
		
		// We can access all the variables except private 
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		//System.out.println(obj1.k);
		System.out.println(obj1.l);
		
		// We can access all the methods except private
		obj1.m1();
		obj1.m2();
		//obj1.m3();
		obj1.m4();		
	}
}
