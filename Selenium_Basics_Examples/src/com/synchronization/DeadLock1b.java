package com.synchronization;

public class DeadLock1b 
{

	synchronized public void d2(DeadLock1a a)
	{
		System.out.println("Thread starts executing d2 method");
		   try{
			   Thread.sleep(5000);
		      }
		   catch(InterruptedException e){}
		   System.out.println("Thread calling a's last() method");
		a.last();
	}
	
	synchronized public void last()
	{
		System.out.println("Thread starts executing B's last() method");
	}
}
