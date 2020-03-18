package com.thread;

public class ThreadSleepDemo3 {

	public static void main(String[] args) throws InterruptedException
	{
	  for(int i=1;i<=10;i++)
	  {
		  System.out.println("Slide NO: "+i);
		  Thread.sleep(2000);
	  }
	}
}
