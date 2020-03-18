package com.constructor;

public class B extends A{
	
	   static int i=10;
		
		int speed;
		
		{
			speed=100;
			System.out.println("The speed of the car is"+speed);
		}
		
		static void m1()
		{
			System.out.println("This is the static method");
		}
		
		B()
		{
			super(10,20);
			System.out.println("This is the child constructor");
		}	

	public static void main(String[] args) {
		B s1=new B();
		B s2=new B();
		s1.m1();

	}

}
