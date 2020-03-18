package com.synchronization;

public class Demo3a 
{

	
	public void display(String name)
	{
		synchronized(Demo3a.class) // Class Level Lock for Synchronized block
		//synchronized(this) // Object Level Lock for Synchronized block
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print("Hello ");
		        try
		        {
		    	  Thread.sleep(2000);
		        }
		       catch(InterruptedException e)
		        {
			
		        }
		        System.out.println(name);
			}
		}
	}
}
