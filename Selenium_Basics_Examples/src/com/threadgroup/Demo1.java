package com.threadgroup;

public class Demo1 extends Thread
 {
    Demo1(ThreadGroup pg,String name)
    {
      super(pg,name);
    }
    
    public void run()
    {
    	System.out.println(Thread.currentThread().getName());
    }
	public static void main(String[] args) throws InterruptedException 
	{
        ThreadGroup pg = new ThreadGroup("Parent Group");
        ThreadGroup cg = new ThreadGroup(pg,"Child Group");
        Thread t1 = new Thread(pg,"Child Thread1");
        Thread t2 = new Thread(pg,"Child Thread2");
        t1.start();
        t2.start();
        System.out.println(pg.activeCount());
        Thread.sleep(3000);
        System.out.println(pg.getParent().getName());
        System.out.println(cg.getParent().getName());        
        System.out.println(cg.activeCount());
	}
}
