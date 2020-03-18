package com.synchronization;

public class DaemonDemo2a extends Thread {
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread is running...");
		}
	}
	
	public static void main(String[] args)
	{
		DaemonDemo2a t1 = new DaemonDemo2a();
		t1.setDaemon(true);
		t1.start();
		System.out.println("End of Main Thread");		
	}

}
