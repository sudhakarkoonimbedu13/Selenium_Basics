package com.synchronization;

public class Demo2c extends Thread
{
	  Demo2a d;
	  
	  public Demo2c(Demo2a d)
	  {
	    this.d = d;  
	  }
	  
	  public void run()
	  {
		  d.displayCharacters();
	  }
	  
}
