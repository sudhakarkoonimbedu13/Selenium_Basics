package com.thread;

public class ThreadSleepDemo2 extends Thread{

	   public void run()
	   {
		   for(int i=0;i<10;i++)
		   {
			  System.out.println("Child Thread");
		   }
	   }
		public static void main(String[] args) 
		{
			ThreadSleepDemo2 t1 = new ThreadSleepDemo2();
			t1.start();
			for(int i=0;i<10;i++)
			{
				System.out.println("Main thread");
				try
				{
		     		System.out.println("Main thread is entered in to sleeping state");
		 			Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					
				}
			}
		}

}
