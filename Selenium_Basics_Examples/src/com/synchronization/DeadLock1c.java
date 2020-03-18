package com.synchronization;

public class DeadLock1c extends Thread
{
    DeadLock1a a = new DeadLock1a();
    DeadLock1b b = new DeadLock1b();
    
    public void m1()
    {
    	this.start();
    	a.d1(b);
    }
    
    public void run()
    {
    	b.d2(a);
    }
	public static void main(String[] args) 
	{
		DeadLock1c t1 = new DeadLock1c();
		t1.m1();
	}

}
