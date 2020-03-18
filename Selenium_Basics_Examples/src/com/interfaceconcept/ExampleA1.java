package com.interfaceconcept;

public class ExampleA1 implements ExampleA{
	//void m1() //Cannot reduce the visibility of the inherited method from A
	public void m1()
	{
		//A.i=20; //The final field A.i cannot be assigned
		System.out.println(ExampleA.i);
		System.out.println("m1 method implementation");
	}
	
	public static void main(String[] args)
	{
		ExampleA s1=new ExampleA1();
		s1.m1();
		s1.printMsg();
		System.out.println(ExampleA.square(10));
	}

}
