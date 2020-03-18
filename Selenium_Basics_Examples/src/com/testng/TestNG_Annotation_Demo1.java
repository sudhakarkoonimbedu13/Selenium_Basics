package com.testng;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotation_Demo1 
{
  public Logger log;
	
  @BeforeSuite
  public void beforeSuite()
  {
	 log = Logger.getLogger(Logger.class.getName());
	 DOMConfigurator.configure("log4j.xml");
	 
	 System.out.println("---This will execute before Test Suite---");
	 log.info("This will execute before Test Suite ie before Test and Class");
	 Reporter.log("This will execute before Test Suite | ");
  }
  
  @BeforeTest
  public void beforeTest()
  {
		 System.out.println("---This will execute before Test---");
		 log.info("This will execute before Test ie before Class and after Test Suite");
		 Reporter.log("This will execute before Test | ");
  }
  
  @BeforeClass
  public void beforeClass()
  {
		 System.out.println("---This will execute before Class---");
		 log.info("This will execute before Class ie before Method and after Test Suite and Test");
		 Reporter.log("This will execute before Class | ");
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
		 System.out.println("---This will execute before Method---");
		 log.info("This will execute before Method ie before Test Case and after Test Suite, Test and Class");
		 Reporter.log("This will execute before Method | ");
  }
  
  @Test
  public void testCase()
  {
		 System.out.println("---This will execute Test Case---");
		 log.info("This will execute Test Case ie after Test Suite, Test, Class and Method");
		 Reporter.log("This will execute actual Test Case | ");
  }
}
