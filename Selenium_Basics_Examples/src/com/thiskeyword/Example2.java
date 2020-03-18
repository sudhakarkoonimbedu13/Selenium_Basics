package com.thiskeyword;

public class Example2 {

public void m1(Example2 obj)
{
	System.out.println("Test1");
}

public void n1()
{
	System.out.println("Test2");
	m1(this);
	System.out.println(this);
}

public static void main(String[] args)
{
	Example2 s1=new Example2();
	s1.n1();
	System.out.println(s1);
}
}
