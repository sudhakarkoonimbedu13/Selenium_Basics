package com.thread;

public class ThreadSleepDemo5 extends Thread
{
  public void run()
  {
 	 
	 for(int i=0;i<10;i++)
 	 {
 		 System.out.println("Child Thread");
 	 }
 	 
 	 System.out.println("Child Thread enters in to sleeping state");
 	 
 	 try{
 		 Thread.sleep(5000);
 	 }
 	 catch(InterruptedException e)
 	 {
 		 System.out.println("Child Thread got interrupted...");
 	 }
  }
	public static void main(String[] args) 
	{
		ThreadSleepDemo5 t1 = new ThreadSleepDemo5();
		t1.start();
		t1.interrupt();
		System.out.println("End of Main Thread");
	}

}
