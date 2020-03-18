package com.constructor;

public class Cons2 extends Cons1{
	
	Cons2()
	{
		System.out.println("Child class no arg constructor");
	}
	Cons2(int i,int j)
	{   
		System.out.println("This is child class argument constructor");
	}

	public static void main(String[] args) 
	{
		
		Cons2 s1 = new Cons2();
		Cons2 s2 = new Cons2(10,20);
	}

}
