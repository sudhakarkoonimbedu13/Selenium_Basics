package com.testng;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo1 
{
	
	public static Logger log;
	 
	
	@BeforeSuite
	public void bSuite()
	{
		log = Logger.getLogger("AnnotationsDemo1");
		PropertyConfigurator.configure("Log4j.properties");
		System.out.println("This is Before Test Suit");
		log.info("This is before test suite");
	}
	
		@BeforeTest
		public void bTest()
		{
			System.out.println("This is Before Test");
			log.info("This is before test");
		}
	
			@BeforeClass
			public void bClass()
			{
				System.out.println("This is Before Class");
				log.info("This is before class");
			}
			
				@BeforeMethod
				public void bMethod()
				{
					System.out.println("This is Before Method");
					log.info("This is before method");
					Reporter.log("This is before Method");
				}
		
					@Test
					public void Test1()
					{
						System.out.println("This is Test Case - 1");
						log.info("This is actual test case - 1");
						Reporter.log("This is actual test case - 1");
					}
	
					@Test
					public void Test2()
					{
						System.out.println("This is Test Case - 2");
						log.info("This is actual test case - 2");
						Reporter.log("This is actual test case - 2");
					}
	
			   @AfterMethod
				public void aMethod()
				{
					System.out.println("This is After Method");
					log.info("This is after method");
					Reporter.log("This is after Method");
				}
		   @AfterClass
			public void aClass()
			{
				System.out.println("This is After Class");
				log.info("This is after class");
			}
		@AfterTest
		public void aTest()
		{
			System.out.println("This is After Test");
			log.info("This is after test");
		}
	
	@AfterSuite
	public void aSuite()
	{
		System.out.println("This is After Test Suit");
		log.info("This is after test suite");
	}
	
	@BeforeGroups
	public void bGroup()
	{
		System.out.println("This is Before Group");
		log.info("This is before group");
	}
	
	@AfterGroups
	public void aGroup()
	{
		System.out.println("This is After Group");
		log.info("This is after group");
	}
	

	
	
	

	

	

	

	
}
