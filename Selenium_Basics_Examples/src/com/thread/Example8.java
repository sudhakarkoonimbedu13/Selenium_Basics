package com.thread;

public class Example8 extends Thread
{
 
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread is running....");
		}
		else
		{
			System.out.println("Thread is running....");
		}		
	}
	
	public static void main(String[] args)
	{
		Example8 t1 = new Example8();
		Example8 t2 = new Example8();
		Example8 t3 = new Example8();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		t3.setDaemon(true); // if we set the user thread as Daemon thread then we will get exception saying that "IllegalThreadStateException"
	}
	
}
