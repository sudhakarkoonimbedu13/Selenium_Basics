package com.concurrent;

import java.util.concurrent.locks.*;
public class Demo4 extends Thread
{
	
	static ReentrantLock l = new ReentrantLock();
	
	Demo4(String name)
	{
		super(name);
	}
	
	public void run()
	{
		if(l.tryLock())
		{
			System.out.println(l.tryLock());
			l.lock();
			System.out.println(Thread.currentThread().getName()+"....get the lock and performing safe operations");
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException e){}
			l.unlock();
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+"....won't get the lock and performing alternative operations");	
		}
	}
	
	public static void main(String[] args)
	{
		Demo4 t1 = new Demo4("First Thread");
		Demo4 t2 = new Demo4("Second Thread");
		
		t1.start();
		t2.start();
		
	}

}
