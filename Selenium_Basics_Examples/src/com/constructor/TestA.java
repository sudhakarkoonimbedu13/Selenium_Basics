package com.constructor;

public class TestA {
	
	TestA()
	{
	    this(10,20);   //By using 'this' keyword, we can call the other constructor in the same class and will be the first statement in any constructor [Constructor chaining]
		System.out.println("Non Argument Constructor");
	}

	TestA(int x,int y)
	{
		this(10,20,30);
		int k=x+y;
		System.out.println(k);
	}
	
	TestA(int x,int y,int z)
	{
		int w=x+y+z;
		System.out.println(w);
	}
	
	public void sum(String s1, String s2)
	 {
		String s3=s1+" "+s2;
		System.out.println(s3);
	 }
	
	public static void main(String[] args)
	{
		TestA s1=new TestA();
		//TestA s2=new TestA(10,20);
		//TestA s3=new TestA(10,20,30);
    }

}
