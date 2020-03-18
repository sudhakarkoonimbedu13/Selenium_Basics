package com.thread;

public class Example9 extends Thread{
	
	public void run()
	{
		System.out.println("no-arg method");
	}
	
	public void run(int x)
	{
		System.out.println("int-arg method");
	}

	public static void main(String[] args) 
	{
		Example9 t = new Example9();
		t.start();		
		t.run(10);
	}

}
