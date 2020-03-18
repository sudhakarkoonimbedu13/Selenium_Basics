package com.synchronization;

public class DeadLock1a 
{
   synchronized public void d1(DeadLock1b b)
   {
	   System.out.println("Thread starts executing d1 method");
	   try{
		   Thread.sleep(5000);
	      }
	   catch(InterruptedException e){}
	   System.out.println("Thread calling b's last() method");
	   b.last();
   }
   
   synchronized public void last()
   {
	   System.out.println("Thread executing A's last() method");
   }
}
