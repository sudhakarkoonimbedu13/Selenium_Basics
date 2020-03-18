package com.thread;

public class Example1 extends Thread{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread is running...");
		}
		
	}

	public static void main(String[] args)
	{
	   Example1 t1 = new Example1(); //Thread Instantiation
	   t1.start();
	   

		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread is running...");
	
	    }
	}		

	// Thread Scheduler	
	
	
	
	
}
