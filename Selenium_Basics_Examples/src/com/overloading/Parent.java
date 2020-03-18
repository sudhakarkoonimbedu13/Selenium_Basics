package com.overloading;

public class Parent {
	
	public void printMsg(int i)
	{
		System.out.println("integer argument");
	}
	
	public void printMsg(float f)
	{
		System.out.println("float argument");
	}
	
	public void printMsg(double d)
	{
		System.out.println("double argument");
	}
	
	public static void main(String args[])
	{
		Parent p=new Parent();
		p.printMsg(10);
		System.out.println("################################");
		p.printMsg(10.5f);
		System.out.println("################################");
		p.printMsg('a');
		System.out.println("################################");
		p.printMsg(10l);
		System.out.println("################################");
		p.printMsg(10.56);
	}

}
