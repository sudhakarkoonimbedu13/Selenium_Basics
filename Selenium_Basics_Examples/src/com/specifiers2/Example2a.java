package com.specifiers2;

import com.specifiers1.Example1;

public class Example2a extends Example1{

	public static void main(String[] args) 
	{
		// By using Parent object we can access only public constructor
		// Example1 obj1 = new Example1();
		   Example1 obj2 = new Example1(10,20);
		// Example1 obj3 = new Example1(10,20,30);
		// Example1 obj4 = new Example1("Sai","Ram");
		   
		// Example2a obj5 = new Example2a();
		// Example2a obj6 = new Example2a(10,20);
		// Example2a obj7 = new Example2a(10,20,30);
		   Example2a obj8 = new Example2a();  // We can access parent class default (no argument constructor) by using child object if that constructor is protected
		     	     
		// We can access public method only using parent object
		   System.out.println(obj2.j);
		   
		// We can access public variable only using parent object    
		   obj2.m2();
		    
		// We can access public and protected variables using child object
		   System.out.println(obj8.j);
		   System.out.println(obj8.l);
		     
		// We can access public and protected methods using child object
		   obj8.m2();
		   obj8.m4();
	}

}
