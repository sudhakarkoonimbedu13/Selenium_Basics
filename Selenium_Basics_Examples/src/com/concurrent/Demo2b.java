package com.concurrent;

public class Demo2b extends Thread {
	
	Demo2a d;
	String name;
	
	Demo2b(Demo2a d,String name)
	{
		this.d = d;
		this.name = name;
	}
	
	public void run()
	{
		d.wish(name);
	}
	
	public static void main(String[] args)
	{
		Demo2a d = new Demo2a();
		Demo2b t1 = new Demo2b(d,"Dhoni");
		Demo2b t2 = new Demo2b(d,"YuvRaj");
		
		t1.start();
		t2.start();		
	}

}
