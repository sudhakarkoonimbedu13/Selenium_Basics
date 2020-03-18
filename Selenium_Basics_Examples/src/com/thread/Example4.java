package com.thread;

public class Example4 extends Thread{

	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			
			try
			{ 
				System.out.println(i);
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
			
		}
	}

	public static void main(String[] args) 
	{
		Example4 t1 = new Example4();
		Example4 t2 = new Example4();
		
		// below are the normal method calls
		
		t1.run(); 
		t2.run();

	}
}
