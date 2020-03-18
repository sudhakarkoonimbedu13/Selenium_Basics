package com.synchronization;

public class Demo3b extends Thread{
	
	  Demo3a d;
	  String name;
	  
	  public Demo3b(Demo3a d, String name)
	  {
	    this.d = d;  
		this.name = name;	  
	  }
	  
	  public void run()
	  {
		  d.display(name);
	  }
	  
	 public static void main(String[] args) 
	 {
	    
	     Demo3a d1 = new Demo3a();
		 Demo3b t1 = new Demo3b(d1,"Dhoni");
		 Demo3b t2 = new Demo3b(d1,"YuvRaj");
		 t1.start();
		 t2.start();
	 }

}
