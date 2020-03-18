package com.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo2a implements Runnable
{ 
	String name;
	
	Demo2a(String name)
	{
		this.name = name;
	}
	
 public void run()
	{
	   System.out.println(Thread.currentThread().getName()+"...executing..."+name+"Job");
	   try
	   {
		   Thread.sleep(2000);
	   }
	   catch(InterruptedException e)
	   {
		   
	   }
	   System.out.println(Thread.currentThread().getName()+"...completed..."+name+"Job"); 
	}
	
 public static void main(String[] args)
	{
		Demo2a[] jobs = {new Demo2a("Siva"),
				         new Demo2a("Sai"),
				         new Demo2a("Saravana"),
				         new Demo2a("Ganesh"),
				         new Demo2a("Kandha"),
				         new Demo2a("Muruga")};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(Demo2a job:jobs)
		{
			service.submit(job);		
		}
		service.shutdown();
	}
}
