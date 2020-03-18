package com.threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo3a implements Callable
{ 
  int number;
  
  Demo3a(int number)
  {
	  this.number = number;
  }
  
  public Object call() throws Exception
  {
	  int sum=0;
	  for(int i=1;i<=number;i++)
	  {
		  sum = sum+i;
	  }
	  System.out.print("Sum of numbers: "+number+" is...");
	  Thread.sleep(3000);
	  return sum;
  }
  
  public static void main(String[] args) throws Exception
  {
	  Demo3a[] jobs = {new Demo3a(10),
			           new Demo3a(20),
			           new Demo3a(30),
			           new Demo3a(40),
			           new Demo3a(50),
			           new Demo3a(60)};
	  
	  ExecutorService service = Executors.newFixedThreadPool(3);
	  
	  for(Demo3a job:jobs)
	  {
		  Future f = service.submit(job);
		  System.out.println(f.get());
	  }
	  service.shutdown();
  }
}
