package com.abstraction;

abstract class Example3 {
	
	abstract void m1();
	abstract void m2();
	
	public void m3()
	{
		System.out.println("Normal Method");
	}

}

class Example3a extends Example3
{
	public void m1()
	{
		System.out.println("First Abstract Method");
	}
	
	public void m2()
	{
		
	}
	
	public static void main(String[] args)
	{
		Example3 s1=new Example3a();
		s1.m3();
	}
}
