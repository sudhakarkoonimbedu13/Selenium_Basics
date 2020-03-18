package com.overriding;

class Example4 
{
  public void m1()
  {
	 System.out.println("This is parent class method");
  }
}

final class Example4a extends Example4
{
 public void m1()
  {
	 System.out.println("This is child class method");
  }
 
 public static void main(String[] args)
 {
	 Example4 s1 = new Example4();
	 s1.m1();
	 
	 Example4a s2 = new Example4a();
	 s2.m1();
	 
	 Example4 s3 = new Example4a();
	 s1.m1();
 }
	
}