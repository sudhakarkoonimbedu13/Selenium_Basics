package com.constructor;

public class TestB extends TestA
{	
    TestB()
    {
    	System.out.println("This is current class constructor"); 
    }
	public static void main(String[] args) 
	{
	 // Whenever child class constructor gets invoked it implicitly invokes the constructor of the parent class
	 // You can also say that the compiler inserts a super(); statement at the beginning of the child class constructor.
	 TestB s2=new TestB(); 
	}
}
