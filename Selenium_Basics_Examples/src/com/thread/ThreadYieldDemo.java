package com.thread;

public class ThreadYieldDemo extends Thread
{
    public void run()
	  {
		  for(int i=0;i<10;i++)
		  {
			  System.out.println("Child Thread");
			  Thread.yield();
		  }
	  }
	  
	 public static void main(String[] args)
	  {
		 ThreadYieldDemo t1 = new ThreadYieldDemo();
		  t1.start();
		  //Thread.yield();
		  for(int i=0;i<10;i++)
		  {
			  System.out.println("Main Thread");
		  }
		  
	  }
}








