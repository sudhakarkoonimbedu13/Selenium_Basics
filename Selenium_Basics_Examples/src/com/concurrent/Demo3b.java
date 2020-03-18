package com.concurrent;

public class Demo3b extends Thread {
	
	Demo3a d;
	String name;
	
	Demo3b(Demo3a d,String name)
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
		Demo3a d = new Demo3a();
		Demo3b t1 = new Demo3b(d,"Dhoni");
		Demo3b t2 = new Demo3b(d,"YuvRaj");
		
		t1.start();
		t2.start();		
	}

}
