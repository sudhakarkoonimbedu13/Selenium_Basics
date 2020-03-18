package com.thread;

public class Example5 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			
			try
			{ 
				System.out.println(i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
			
		}
	}

	public static void main(String[] args) throws InterruptedException 
	{
		Example5 t1 = new Example5();
		Example5 t2 = new Example5();
		Example5 t3 = new Example5();
		
		t1.start();
		t1.join(2000);
		t2.start();
		t3.start();

	}
}
