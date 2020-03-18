package com.thread;

public class WaitDemo1a extends Thread 
{
  
	public static void main(String[] args) throws InterruptedException
	{
	   WaitDemo1b t1 = new WaitDemo1b();	   
	   
	   t1.start();
	   
	   //Thread.sleep(10000);
	   
	   System.out.println("Main Thread entered in to waiting state");

	   synchronized(t1)
	   {
	   t1.wait(10000);
	   }
	   
	   System.out.println(t1.total);	   
	   
	}


}
