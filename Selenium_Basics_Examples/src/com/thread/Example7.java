package com.thread;

public class Example7 extends Thread{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) throws InterruptedException 
	{
		Example7 t1 = new Example7();
		Example7 t2 = new Example7();
		Example7 t3 = new Example7();
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.setName("First Thread");
		System.out.println("The new name for Thread-1 is: "+t1.getName());

	}

}
