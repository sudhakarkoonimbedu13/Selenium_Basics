package com.thread;

public class ThreadJoinDemo2 extends Thread
{
    public static Thread mt;
	public void run()
	  {
		try{ 
			mt.join();
		   }
		catch(InterruptedException e)
		{
			
		}
		for(int i=0;i<10;i++)
			  {
				  System.out.println("Child Thread");
				  
			  }
}
	
	public static void main(String[] args) throws InterruptedException
	  {
		ThreadJoinDemo2.mt = Thread.currentThread();		
		ThreadJoinDemo2 t1 = new ThreadJoinDemo2();
		t1.start();
		for(int i=0;i<10;i++)
		  {
			  System.out.println("Main Thread");
			  Thread.sleep(2000);
		  }		  
	  }
}
