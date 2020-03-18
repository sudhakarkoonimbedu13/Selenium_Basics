package com.thread;

public class ThreadJoinDemo3 extends Thread{

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
		ThreadJoinDemo3.mt = Thread.currentThread();		
		ThreadJoinDemo3 t1 = new ThreadJoinDemo3();
		t1.start();
		t1.join();
		for(int i=0;i<10;i++)
		  {
			  System.out.println("Main Thread");
			  Thread.sleep(2000);
		  }		  
	  }

}
