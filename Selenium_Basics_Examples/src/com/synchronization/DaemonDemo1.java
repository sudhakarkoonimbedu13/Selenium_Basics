package com.synchronization;

public class DaemonDemo1 extends Thread {

	public static void main(String[] args) 
	{
      System.out.println(Thread.currentThread().isDaemon());
      // Thread.currentThread().setDaemon(true); IllegalThreadStateException
      DaemonDemo1 t1 = new DaemonDemo1();
      System.out.println(t1.isDaemon());
      t1.setDaemon(true);
      System.out.println(t1.isDaemon());

	}

}
