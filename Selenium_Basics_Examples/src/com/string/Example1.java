package com.string;

public class Example1 
{
public static void main(String[] args)
{
	String a="meow";
    String ab=a+"deal";
    String abd="meowdeal";
    System.out.println(ab==abd);
    
    String x1="abc";
    String x2="abc";
    System.out.println(x1==x2);
    System.out.println(x1.equals(x2));
    
    
    String s1=new String("abc");
    s1.concat("neo");
    System.out.println(s1);
}


}
