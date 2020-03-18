package com.thread;

public class ThreadSleepDemo4 extends Thread
{
 public void run()
 {
	 try
	 {
	   for(int i=0;i<10;i++)
	    {
   		   System.out.println("Child Thread");
		   Thread.sleep(2000);
		}
	 } 
	 catch(InterruptedException e)
	 {
		 System.out.println("Child thread interrupted");
	 }
 }
	public static void main(String[] args) 
	{
		
		ThreadSleepDemo4 t1 = new ThreadSleepDemo4();
		t1.start();
		t1.interrupt();
		System.out.println("End of Main Thread");
	}

}
