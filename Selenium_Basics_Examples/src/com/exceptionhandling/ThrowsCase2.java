package com.exceptionhandling;

//public class ThrowsCase2 {
//
//	public static void main(String[] args) throws ThrowsCase2 //No exception of type ThrowsCase2 can be thrown; an exception type must be a subclass of Throwable
//	{
//	   
//	}
//
//}

public class ThrowsCase2 extends RuntimeException{

	public static void main(String[] args) throws ThrowsCase2
	{
	   System.out.println("Hi..Hello");
	}

}
