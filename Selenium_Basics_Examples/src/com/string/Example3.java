package com.string;

public class Example3 {

	public static void main(String[] args) 
	{
	  
	  // String Literal Example	
	  String s1 = "Saravana";
	  String s2 = "Saravana";
	  String s3 = s1+"bava";
	  String s4 = "Saravanabava";
	  String s5 = "SARAVANABAVA";
	  String s6=s3.intern();
	  String s7="Hello Java";
	  
	  System.out.println(s1==s2);
	  System.out.println(s1.equals(s2));
	  
	  // compareTo()
	  System.out.println("******compareTo()******");
	  System.out.println(s1.compareTo(s2));
	  

	  System.out.println("***********************");
	  System.out.println(s3==s4);
	  System.out.println(s3.equals(s4));
	  
	  // equalIgnoreCase()
	  System.out.println("******equalIgnoreCase()******");
	  System.out.println(s4==s5);	  
	  System.out.println(s4.equals(s5));
	  System.out.println(s4.equalsIgnoreCase(s5));
	  
	  // intern()
	  System.out.println("******intern()******");
	  System.out.println(s4==s6);
	  System.out.println(s4.equals(s6));  
	  
	  
	  // toUpperCase()
	  System.out.println("******toUpperCase()******");
	  System.out.println(s7.toUpperCase());
	  
	  // toLowerCase()
	  System.out.println("******toLowerCase()******");
	  System.out.println(s7.toLowerCase());
	  
	  // length()
	  System.out.println("******length()******");
	  System.out.println(s7.length());
	  
	  // charAt()
	  System.out.println("******charAt()******");
	  System.out.println(s7.charAt(1));
	  
	  // valueOf()
	  System.out.println("******valueOf()******");
	  int i=20;
	  String str1 = String.valueOf(i);
	  System.out.println(str1+18+ "Year");
     
	}

}
