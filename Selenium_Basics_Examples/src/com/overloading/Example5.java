package com.overloading;

class Example5 
{
	
}

class A extends Example5
{
	
}

class B
{
	public void printMsg(Example5 a)
	{
		System.out.println("Example5 version");
	}
	
	public void printMsg(B b)
	{
		System.out.println("Example5a version");
	}
	
	public static void main(String[] args)
	{
		B s1=new B();
		Example5 a1=new Example5();
		s1.printMsg(a1);
		A a2=new A();
		s1.printMsg(a2);
		Example5 a3=new A();
		s1.printMsg(a3);		
	}
}

