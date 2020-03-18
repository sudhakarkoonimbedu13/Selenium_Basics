package com.synchronization;

public class Demo1b extends Thread
{
  Demo1a d;
  String name;
  
  public Demo1b(Demo1a d, String name)
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
    
     Demo1a d1 = new Demo1a();
	 Demo1b t1 = new Demo1b(d1,"Dhoni");
	 Demo1b t2 = new Demo1b(d1,"YuvRaj");
	 t1.start();
	 t2.start();
 }

}
