package com.overloading;

public class Example4 {

	public void printMsg(int i)
	{
	   System.out.println("int argument");
	}
	
	public void printMsg(int...i)
	{
		System.out.println("var-arg method");
	}

	public static void main(String[] args) 
	{
		Example4 s1=new Example4();
		s1.printMsg(10);
		s1.printMsg();
		s1.printMsg(10,20);
		s1.printMsg(10,20,30);
	}

}
