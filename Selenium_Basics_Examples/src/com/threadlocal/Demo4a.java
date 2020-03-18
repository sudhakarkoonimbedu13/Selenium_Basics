package com.threadlocal;

public class Demo4a extends Thread
{ 
	 
	public static InheritableThreadLocal tl = new InheritableThreadLocal()
	{
		   public Object childValue(Object p)
		   {
			  return "CC";
		   }
	 };
	
	public void run()
	 {
		 tl.set("PP");
		 System.out.println(Thread.currentThread().getName()+"thread local value is "+tl.get());
		 Demo4b ct = new Demo4b();
		 ct.start();
	 }	 
	 
}
