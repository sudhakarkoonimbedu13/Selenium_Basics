package com.testng;

import org.testng.annotations.Test;

public class Demo3 
{
   @Test (priority=0)
   public void TestCase1()
   {
	   System.out.println("Executing the Test Case - 1");
   }
   
   @Test (dependsOnMethods="TestCase3",enabled=false)
   public void TestCase2()
   {
	   System.out.println("Executing the Test Case - 2"); 
   }
   
   @Test (dependsOnMethods="TestCase1",priority=1)
   public void TestCase3()
   {
	   System.out.println("Executing the Test Case - 3"); 
   }

}
