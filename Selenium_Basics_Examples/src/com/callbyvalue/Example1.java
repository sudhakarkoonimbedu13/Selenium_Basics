package com.callbyvalue;

public class Example1 {

	public static void main(String[] args) 
	{
		
		System.out.println("********************String Object************************************");
		
		String s1=new String("abc");
		System.out.println(s1);
		String s2=new String("abc");
		System.out.println(s1);
		
		if(s1==s2)
		{
			System.out.println("Both strings content is same");
		}
		else
		{
			System.out.println("Both strings content is not same");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("Both strings content is same");
		}
		else
		{
			System.out.println("Both strings content is not same");
		}
		
		System.out.println("******************StringBuffer***********************************");
		
		StringBuffer sb1=new StringBuffer("abc");
		System.out.println(sb1);
		StringBuffer sb2=new StringBuffer("abc");
		System.out.println(sb1);
		
		if(sb1==sb2)
		{
			System.out.println("Both strings content is same");
		}
		else
		{
			System.out.println("Both strings content is not same");
		}
		
		if(sb1.equals(sb2))
		{
			System.out.println("Both strings content is same");
		}
		else
		{
			System.out.println("Both strings content is not same");  			
	    }
		
		System.out.println("********************String Class************************************");
		
		String s3 = "abc";
		System.out.println(s3);
		String s4 = "abc";
		System.out.println(s4);
		
		if(s3==s4)
		{
			System.out.println("Both strings content is same");
		}
		else
		{
			System.out.println("Both strings content is not same");
		}
		
		if(s3.equals(s4))
		{
			System.out.println("Both strings content is same");
		}
		else
		{
			System.out.println("Both strings content is not same");
		}
	}

}
