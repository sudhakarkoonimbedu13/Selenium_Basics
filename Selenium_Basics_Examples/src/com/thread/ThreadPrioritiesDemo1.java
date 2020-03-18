package com.thread;

public class ThreadPrioritiesDemo1 extends Thread
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
	  ThreadPrioritiesDemo1 t1 = new ThreadPrioritiesDemo1();
	  t1.setPriority(7);
	  t1.start();	  
	  for(int i=0;i<10;i++)
	  {
		  System.out.println("Main Thread");
	  }
	  
  }
}
