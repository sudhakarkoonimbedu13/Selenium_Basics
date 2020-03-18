// String vs StringBuffer vs StringBuilder
package com.string;

public class Example5 {

	public String concatString()
	{
		String str1 = "Hello";
		for(int i=0;i<=1000;i++)
		{
		  str1=str1+"Java";
		}
		return str1;
	}
	
	public String concatStringBuffer()
	{
		StringBuffer sb1 = new StringBuffer("Hello");
		for(int i=0;i<=1000;i++)
		{
		  sb1 = sb1.append("Java");
		}
		return sb1.toString();
	}
	
	public String concatStringBuilder()
	{
		StringBuilder sb2 = new StringBuilder("Hello");
		for(int i=0;i<=1000;i++)
		{
		  sb2=sb2.append("Java");
		}
		return sb2.toString();
	}
	
	public static void main(String[] args) 
	{
		Example5 s1 = new Example5();
		System.out.println("********String***************************");
		Long startTime = System.currentTimeMillis();
		s1.concatString();
		System.out.println("Time taken for String object is: "+(System.currentTimeMillis()-startTime));
		System.out.println("********StringBuffer***************************");
		startTime = System.currentTimeMillis();
		s1.concatStringBuffer();
		System.out.println("Time taken for StringBuffer object is: "+(System.currentTimeMillis()-startTime));
		System.out.println("********StringBuilder***************************");
		startTime = System.currentTimeMillis();
		s1.concatStringBuilder();
		System.out.println("Time taken for StringBuilder object is: "+(System.currentTimeMillis()-startTime));
	}

}
