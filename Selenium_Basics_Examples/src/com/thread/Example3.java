package com.thread;

public class Example3 extends Thread{
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
			  Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(i);
			}			
			
		}
	}

	public static void main(String[] args) 
	{
		Example3 t1 = new Example3();
		Example3 t2 = new Example3();
		
		t1.start();
		t2.start();
		// t1.start(); - If we start the thread again then we will get IllegalThreadStateException

	}

}
