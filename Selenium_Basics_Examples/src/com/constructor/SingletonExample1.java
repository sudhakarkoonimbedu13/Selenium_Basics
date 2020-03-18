package com.constructor;

public class SingletonExample1 {
	
	private static SingletonExample1 t=new SingletonExample1();
	
	private SingletonExample1()
	{
		
	}
	
	public static SingletonExample1 getTest()
	{
		return t;
	}

	public static void main(String[] args)
	{
		System.out.println("First Object");
		SingletonExample1 t1 = SingletonExample1.getTest();
		System.out.println(t1);
		
		System.out.println("Second Object");
		SingletonExample1 t2 = SingletonExample1.getTest();
		System.out.println(t2);
		
		System.out.println("Third Object");
		SingletonExample1 t3 = SingletonExample1.getTest();
		System.out.println(t3);
		
	}
}
