package com.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

public class Demo5 extends Thread 
{ 
  static ReentrantLock l = new ReentrantLock();
  
  Demo5(String name)
  {
	  super(name);
  }
  
  public void run()
  {
	  do
	  {
		 try
		 {
			 if(l.tryLock(5000,TimeUnit.MILLISECONDS))
				 {
					 System.out.println(Thread.currentThread().getName()+"...get lock and performing safe operartions");
					 Thread.sleep(30000);
					 l.unlock();
					 break;
				 }
			 else
				 {
					 System.out.println(Thread.currentThread().getName()+"......won't get lock and will try again");
				 }
			 }
		 catch(Exception e){}
	  } while(true);
  }

	public static void main(String[] args) {
	
		Demo5 t1 = new Demo5("First Thread");
		Demo5 t2 = new Demo5("Second Thread");
		
		t1.start();
		t2.start();
	}

}
