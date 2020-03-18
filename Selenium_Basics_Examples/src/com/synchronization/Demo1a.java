package com.synchronization;

public class Demo1a 
{
	
	public void display(String name)
	{
		synchronized(Demo1a.class)
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
    
