package com.overloading;

public class Example2 {
	
	public void  printMsg(String s)
	{
		System.out.println("This is String reference");
	}
	
	public void  printMsg(StringBuffer sb)
	{
		System.out.println("This is String Buffer reference");
	}
	
	public static void main(String[] args) 
	{     
	   Example2 s1=new Example2();
	   s1.printMsg("Sai");
	   //s1.printMsg(null); //The method printMsg(String) is ambiguous for the type Example2
	}

}
