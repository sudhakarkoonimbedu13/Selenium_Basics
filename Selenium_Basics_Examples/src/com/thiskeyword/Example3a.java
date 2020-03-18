package com.thiskeyword;

public class Example3a 
{
	String studentName="Sai";
	
	Example3a()
	{
	  System.out.println("Constructor A");
	  Example3b s2=new Example3b(this);
	  System.out.println(this);
	  s2.display();
	}
	
	public static void main(String[] args)
	{
		Example3a s1=new Example3a();
		System.out.println(s1);
	}

}
