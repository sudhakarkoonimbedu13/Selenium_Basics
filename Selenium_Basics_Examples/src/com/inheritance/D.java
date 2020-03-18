package com.inheritance;

public class D //extends D {
{
	public void printMgs()
	{
		System.out.println("Cyclic Inheritance");
	}

	public static void main(String[] args) 
	{
		
      D d1=new D();
      d1.printMgs();
	}

}
