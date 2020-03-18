package com.testng;

import org.testng.annotations.Test;

public class TestNG_Annotation_Groups 
{
  
	@Test(groups = {"Car"})
    public void testCar1()
    {
    	System.out.println("This is first test car test case");
    }
	
	@Test(groups = {"Car"})
	public void testCar2()
	{
		System.out.println("This is second test car test case");
	}
	
	@Test(groups = {"Car","Benz"})
	public void testCar3()
	{
		System.out.println("This is third test car test case");
	}
	
	
	@Test(groups = {"Bike"})
	public void testBike1()
	{
		System.out.println("This is first test bike test case");
	}
	
	@Test(groups = {"Bike"})
	public void testBike3()
	{
		System.out.println("This is second test bike test case");
	}
	
	@Test(groups = {"Bike","Activa"})
	public void testBike2()
	{
		System.out.println("This is third test bike test case");
	}
}

