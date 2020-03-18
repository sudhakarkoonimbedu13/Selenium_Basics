package com.specifiers2;

import com.specifiers1.Example1;  // While working with other package classes, we must use this statement

public class Example1a {

	public static void main(String[] args) 
	{
		// We can access only public constructor and can't access default,private and protected constructors
		// Example1 obj1 = new Example1();           
		   Example1 obj1 = new Example1(10,20);
		// Example1 obj2 = new Example1(10,20,30);
		// Example1 obj3 = new Example1("Sai","Ram");
		   
		// We can access only public variable
		// System.out.println(obj1.i);
		   System.out.println(obj1.j);
		// System.out.println(obj1.k);
		// System.out.println(obj1.l);
		   
		// We can access public method only
		// obj1.m1();
		   obj1.m2();
		// obj1.m3();
	    // obj1.m4();		   
	}

}
