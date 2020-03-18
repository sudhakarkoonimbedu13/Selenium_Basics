package com.synchronization;

public class Demo2d 
{
	 public static void main(String[] args) 
	 {
	    
	     Demo2a d1 = new Demo2a();
	     Demo2a d2 = new Demo2a();
		 Demo2b t1 = new Demo2b(d1);
		 Demo2c t2 = new Demo2c(d2);
		 t1.start();
		 t2.start();
	 }
}
