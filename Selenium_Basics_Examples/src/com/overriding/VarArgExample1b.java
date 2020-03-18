package com.overriding;

public class VarArgExample1b {

	public static void main(String[] args) 
	{
		
		VarArgExample1a s1 = new VarArgExample1a();
		s1.m1(10);
		
		VarArgExample1 s2 = new VarArgExample1();
		s2.m1(10);
		
		VarArgExample1a s3 = new VarArgExample1();
		s3.m1(10);
	}

}
