package com.overloading;

public class Example1 {

	public void printMsg(Object o)
	{
		System.out.println("This is object reference");
	}
	
	public void  printMsg(String s)
	{
		System.out.println("This is String reference");
	}

	
	public static void main(String[] args) 
	{	 
		Example1 s1=new Example1();
        s1.printMsg(new Object());
        System.out.println("######################");
        s1.printMsg("Saravanabava");
        System.out.println("######################");
        s1.printMsg(null);
	}

}
