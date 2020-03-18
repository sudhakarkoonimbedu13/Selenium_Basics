// public static native void sleep(long ms) throws InterruptedException
// public static void sleep(long ms,int ns) throws InterruptedException

package com.thread;

public class ThreadSleepDemo1 extends Thread
{
   public void run()
   {
	   for(int i=0;i<10;i++)
	   {
		  System.out.println("Child Thread");
		  try
		  {
			  System.out.println("Child thread is entered in to sleeping state");
			  Thread.sleep(2000);
			  
		  }
		  catch(InterruptedException e)
		  {
			  
		  }
	   }
   }
  public static void main(String[] args) 
	{
		ThreadSleepDemo1 t1 = new ThreadSleepDemo1();
		t1.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread");
		}
	}

}
