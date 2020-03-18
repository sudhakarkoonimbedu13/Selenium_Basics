package com.inheritance;

public class B extends A{
	
	public void sum(int x,int y,int z)
	{
		int w=x+y+z;
		System.out.println(w);
	}
	
	public void sum(int x,int y)
	{
		x=x+10;
		y=y+20;
		int k=x+y;
		System.out.println(k);
	}
	
	public void sumAll()
	{
		System.out.println("Parent Class B");
	}

	public static void main(String[] args) 
	{
		A s1=new A();
		s1.sum(10,20);
	    s1.sum();
	    
	    B s2=new B();
	    s2.sum();
	    s2.sum(20, 30);
	    s2.sum(10, 20, 30);	    
	    
	    //Accessing the Parent class method which is override in child class
	    A s3=new B();
	    s3.sum(100, 200);      

	}

}
