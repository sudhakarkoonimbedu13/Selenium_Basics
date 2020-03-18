package com.threadlocal;

public class Demo4b extends Thread
{
 
public void run()
 {

	System.out.println(Thread.currentThread().getName()+"thread local value is "+Demo4a.tl.get());
 }
	
 
 public static void main(String[] args)
 {
	 Demo4a pt = new Demo4a();
	 pt.start();
 }
}
