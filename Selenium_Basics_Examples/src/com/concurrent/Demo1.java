package com.concurrent;

import java.util.concurrent.locks.*;

public class Demo1 
{  
	
	static ReentrantLock l = new ReentrantLock();
	
	public static void main(String[] args)
	{
		l.lock();
		l.lock();
		System.out.println(l.getHoldCount());
		System.out.println(l.isHeldByCurrentThread());
		System.out.println(l.isLocked());
		l.unlock();
		System.out.println(l.getHoldCount());
		System.out.println(l.isLocked());
		l.unlock();
		System.out.println(l.getHoldCount());
		System.out.println(l.isLocked());
	    System.out.println(l.getQueueLength());
	    System.out.println(l.isFair());	    
		
	}

}
