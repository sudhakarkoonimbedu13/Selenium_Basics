package com.thread;

public class Example6 extends Thread{

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
		Example6 t1 = new Example6();
		Example6 t2 = new Example6();
		Example6 t3 = new Example6();
		
		t1.start();
		System.out.println("Thread Name of t1 is: "+t1.getName());
		System.out.println("Thread Id of t1 is: "+t1.getId());
		t2.start();
		System.out.println("Thread Name of t1 is: "+t2.getName());
		System.out.println("Thread Id of t1 is: "+t2.getId());
		t3.start();
		System.out.println("Thread Name of t1 is: "+t3.getName());
		System.out.println("Thread Id of t1 is: "+t3.getId());

	}

}
