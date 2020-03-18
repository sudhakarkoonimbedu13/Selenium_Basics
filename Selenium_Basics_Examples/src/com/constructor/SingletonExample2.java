package com.constructor;

public class SingletonExample2 
{

	private static SingletonExample2 t=null;
	
	private SingletonExample2()
	{
		
	}
	
	public static SingletonExample2 getTest()
	{
		if(t==null)
		{
			t=new SingletonExample2();
		}
		return t;
	}
	
	public static void main(String[] args)
	{
		System.out.println("First Object");
		SingletonExample2 t1 = new SingletonExample2();
		System.out.println(t1);
		
		System.out.println("Second Object");
		SingletonExample2 t2 = new SingletonExample2();
		System.out.println(t2);
		
		System.out.println("Third Object");
		SingletonExample2 t3 = SingletonExample2.getTest();
		System.out.println(t3);
	}
}
