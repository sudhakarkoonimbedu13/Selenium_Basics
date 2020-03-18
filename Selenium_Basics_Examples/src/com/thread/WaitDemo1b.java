package com.thread;

public class WaitDemo1b extends Thread 
{
    int total=0;
	public void run()
	{
		System.out.println("Child Thread starts calculation");
		
		for(int i=1;i<=100;i++)
		{
			
			total=total+i;
		}		
	
		synchronized(this)
		{
		this.notify();
		}
		
	}


}
