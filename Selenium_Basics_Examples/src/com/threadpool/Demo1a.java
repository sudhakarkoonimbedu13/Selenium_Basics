package com.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo1a implements Runnable
{
	String name;
	
	Demo1a(String name)
	{
		this.name = name;
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"...starts executing");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){ }		
	}
	
    public static void main(String[] args)
    {
    	Demo1a t1 = new Demo1a("First Thread");
    	Demo1a t2 = new Demo1a("Second Thread");
    	
    	ExecutorService service = Executors.newFixedThreadPool(2);
    	
    	service.submit(t1);
    	service.submit(t2);
    	
    	service.shutdown();
    }
}
