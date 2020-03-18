package com.overloading;

public class StringExample {

	public static void main(String[] args) 
	{		
		// String Class Example
		String str=new String("Sai");
		str.concat("Ram");
		System.out.println(str);
		
		// StringBuffer Class Example
		StringBuffer sb=new StringBuffer("Om");
		sb.append(" Namasivaya");
		sb.append(" Hara Hara Mahadheva");
		System.out.println(sb.length());
		System.out.println(sb);
		
		
		String s1="abc";
		System.out.println(s1.concat("def"));
		System.out.println(s1);
	}

}
