package com.threadlocal;

public class Demo1 
{
  private static ThreadLocal tl =  new ThreadLocal();
  
	public static void main(String[] args) 
	{
		System.out.println(tl.get());
		tl.set("Sai Ram");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());       
	}

}
