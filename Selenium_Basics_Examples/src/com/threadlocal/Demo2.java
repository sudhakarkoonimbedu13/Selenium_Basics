package com.threadlocal;

public class Demo2 
{
	private static ThreadLocal tl = new ThreadLocal()
	 {
		public Object initialValue()
		{
			return "Sivayanamaha";
		}
	 };

	public static void main(String[] args) 
	{
		System.out.println(tl.get());
		tl.set("Sai Ram");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
	}

}
