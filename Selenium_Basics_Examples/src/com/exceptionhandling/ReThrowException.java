package com.exceptionhandling;

public class ReThrowException 
{

	public static void main(String[] args) 
	{
	   try
	   {
		   System.out.println(10/0);		   
	   }
	   catch(ArithmeticException e)
	   {
		   throw new NullPointerException("Exception changed from Arithmetic Exception to Null Pointer Exception");
	   }

	}

}
