package com.thread;

public class ThreadPrioritiesDemo2 extends Thread
{
	  public void run()
	  {
		  for(int i=0;i<10;i++)
		  {
			  System.out.println("Child Thread");
		  }
	  }
	  
	  public static void main(String[] args)
	  {
		  ThreadPrioritiesDemo2 t1 = new ThreadPrioritiesDemo2();
		//************************IllegalArgumentException******************************************************
		  t1.setPriority(11);
		//************************IllegalArgumentException******************************************************
		  t1.start();	  
		  for(int i=0;i<10;i++)
		  {
			  System.out.println("Main Thread");
		  }
		  
	  }
}
