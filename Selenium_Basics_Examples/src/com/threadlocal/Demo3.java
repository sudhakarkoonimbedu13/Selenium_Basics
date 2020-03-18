package com.threadlocal;

public class Demo3 extends Thread
{
  private static Integer counter=0;
  private static ThreadLocal tl = new ThreadLocal()
	 {
		public Object initialValue()
		{
			return ++counter;
		}
	 };
	 
  Demo3(String name)
  {
	  super(name);
  }
  
  public void run()
  {
	  System.out.println(tl.get());
	  System.out.println(Thread.currentThread().getName()+"...is executing with counter value: "+tl.get());
	  try
	  {
		  Thread.sleep(2000);
	  }
	  catch(Exception e){}
  }

	public static void main(String[] args) 
	{
		Demo3 c1 = new Demo3("First Thread");
		Demo3 c2 = new Demo3("Second Thread");
		Demo3 c3 = new Demo3("Third Thread");
		Demo3 c4 = new Demo3("Fourth Thread");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();

	}

}
