package com.overriding;

class Example1 {
	
	public Object m1()
	{
		return null;
	}
}

class Example1a extends Example1
{
	public String m1()
	{
	   return null;
	}
}

class Test
{
	public static void main(String[] args)
	{
		Example1 s1=new Example1();
		Example1a s2=new Example1a();
		Example1 s3=new Example1a();
		s1.m1();
		s2.m1();
		s3.m1();		
	}
}
