package com.thiskeyword;

public class Example4 {
	
	public void m1()
	{
		System.out.println(this);
	}

	public static void main(String[] args) 
	{
   
		Example4 s1=new Example4();
		System.out.println(s1);
		System.out.println("####################");
		s1.m1();
	}

}
