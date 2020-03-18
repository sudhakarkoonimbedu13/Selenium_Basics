package com.overriding;

public class MethodHidingImpl {

	public static void main(String[] args) 
	{
		MethodHiding s1 = new MethodHiding();
		s1.m1();
		
		A s2 = new A();
		s2.m1();
		
		MethodHiding s3 = new A();  // In Method Hiding method resolution takes care by compiler based on reference type, but not on run time object
		s3.m1();
	}
}
