package com.overriding;

class VarArgExample1a {
	
	public void m1(int...x)
	{
		System.out.println("Parent Method");
	}
}

class VarArgExample1 extends VarArgExample1a
{
	public void m1(int x)
	{
		System.out.println("Child Method");
	}
}
