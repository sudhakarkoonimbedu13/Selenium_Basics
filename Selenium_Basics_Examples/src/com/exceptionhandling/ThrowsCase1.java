package com.exceptionhandling;

public class ThrowsCase1 //Class will not support throws keyword
{
	ThrowsCase1() throws InterruptedException
	{
		
	}
	
	public static void main(String[] args) throws InterruptedException
	{
      Thread.sleep(5000);
	}

}
