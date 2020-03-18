package com.specifiers1;

public class Example3 extends Example1{

	public static void main(String[] args) 
	{
		// By using child object,we can access only default constructor
		// By creating the Parent class object, we can access all the constructors except private
		
		//Example1 obj1 = new Example1();
		Example3 obj1 = new Example3();
		//Example3 obj2 = new Example3(10,20);
		//Example3 obj3 = new Example3(10,20,30);
		//Example3 obj4 = new Example3("Sai","Ram");
		
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

