package com.string;

public class Example6 {

	public static void main(String[] args) 
	{
		String str1 = new String("Hello");
		System.out.println(str1.hashCode());
		str1=str1.concat("Java");
		System.out.println(str1.hashCode());
		
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1.hashCode());
        sb1.append("Java");
		System.out.println(sb1.hashCode());
	}

}
