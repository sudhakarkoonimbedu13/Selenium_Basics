package com.synchronization;

public class Demo2b extends Thread
{
	  Demo2a d;
  
	  public Demo2b(Demo2a d)
	  {
	    this.d = d;  
	  }
	  
	  public void run()
	  {
		  d.displayNumbers();
	  }	  

}
