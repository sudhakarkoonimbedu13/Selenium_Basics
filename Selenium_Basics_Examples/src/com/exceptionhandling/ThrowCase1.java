package com.exceptionhandling;


public class ThrowCase1 
{
   public static ArithmeticException e = new ArithmeticException();
	
   //public static ArithmeticException e;	

	public static void main(String[] args) 
	{
		throw e;
	}
}
