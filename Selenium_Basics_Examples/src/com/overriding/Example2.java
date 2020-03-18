package com.overriding;

class Example2 {
	
	private void m1()
	{
		System.out.println("Parent Private Method");
	}
}

class Example2a extends Example2
{
	private void m1()
	{
		System.out.println("Child Private Method");
	}

}
