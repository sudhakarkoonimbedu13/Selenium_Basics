package com.thread;

public class Example2 implements Runnable{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread is running...");
		}
	}

	public static void main(String[] args) 
	{
		Example2 t1 = new Example2();
		Thread t2 = new Thread(t1);
		t2.start();
	}

}
