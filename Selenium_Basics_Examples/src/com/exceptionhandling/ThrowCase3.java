package com.exceptionhandling;

//public class ThrowCase3 {
//
//	public static void main(String[] args) 
//	{
//		throw new ThrowCase3(); //No exception of type ThrowCase3 can be thrown; an exception type must be a subclass of Throwable
//	}
//
//}


public class ThrowCase3 extends RuntimeException{

	public static void main(String[] args) 
	{
		throw new ThrowCase3();
	}

}