package com.synchronization;

public class Demo2a 
{

	public static synchronized void displayNumbers()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i);
	        try
	        {
	    	  Thread.sleep(2000);
	        }
	       catch(InterruptedException e)
	        {
		
	        }
		}
	}
	
	public static synchronized void displayCharacters()
	{
		for(int i=65;i<=75;i++)
		{
			System.out.print((char)i);
	        try
	        {
	    	  Thread.sleep(2000);
	        }
	       catch(InterruptedException e)
	        {
		
	        }
		}
	}
	
}
