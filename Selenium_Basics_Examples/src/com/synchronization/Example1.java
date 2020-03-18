package com.synchronization;

public class Example1 extends Thread
{

	public static synchronized void m1() throws InterruptedException
	{
		System.out.println("This is the first sync method");
		Thread.sleep(5000);
	}
	
	public static synchronized void m2() throws InterruptedException
	{
		System.out.println("This is the second sync method");
		Thread.sleep(5000);
	}
	
	public void m3()
	{
		System.out.println("This is normal method");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		Example1 t1 = new Example1();
		
		Example1 t2 = new Example1();
		
		t1.start();
		t1.m1();
		t2.start();
		t2.m1();
		t1.m2();
		t1.m3();		

	}

}
