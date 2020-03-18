package com.overriding;

abstract class Example3 {
	
	abstract void m1();

}

class Example3a extends Example3
{
	void m1()
	{
		
	}
}

//***********************************************************************************//

class Example3b{
	void m1()
	{
		
	}
}

abstract class Example3c extends Example3b
{
	abstract void m1();
}

class Example4d extends Example3c
{
	void m1()
	{
		
	}
	
	public static void main(String[] args)
	{
		Example4d s1 = new Example4d();
		s1.m1();
	}
}

