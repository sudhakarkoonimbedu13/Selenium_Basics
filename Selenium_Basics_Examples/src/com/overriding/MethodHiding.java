package com.overriding;

class MethodHiding {
	
	public static void m1()
	{
		System.out.println("Parent Method");
	}
}

class A extends MethodHiding
{
	public static void m1()
	{
		System.out.println("Child Method");
	}
}

