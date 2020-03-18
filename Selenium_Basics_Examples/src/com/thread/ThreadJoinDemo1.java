package com.thread;

public class ThreadJoinDemo1 extends Thread {
   
   public void run()
	  {
		try{  
	    for(int i=0;i<10;i++)
		  {
			  System.out.println("Child Thread");
			  Thread.sleep(2000);
		  }
		}
		catch(InterruptedException e)
		{
			
		}
	  }
	  
	public static void main(String[] args) throws InterruptedException
	  {
		ThreadJoinDemo1 t1 = new ThreadJoinDemo1();
		t1.start();
		t1.join(10000);
		for(int i=0;i<10;i++)
		  {
			  System.out.println("Main Thread");
		  }		  
	  }
}
