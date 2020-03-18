package com.testng;

import org.testng.annotations.Test;


public class Demo2 
{
   
	@Test (groups ={"ABC"})
	public void Test1()
	{
		System.out.println("This is test case - 1 belongs to ABC group");
	}
	
	@Test (groups ={"ABC"})
	public void Test2()
	{
   		System.out.println("This is test case - 2 belongs to ABC group");
	}
	
	@Test (groups ={"XYZ"})
	public void Test3()
	{
		System.out.println("This is test case - 3 belongs to XYZ group");
	}
	
	@Test (groups ={"XYZ"})
	public void Test4()
	{
		System.out.println("This is test case - 4 belongs to XYZ group");
	}
	
	@Test (groups ={"XYZ","DEF"})
	public void Test5()
	{
		System.out.println("This is test case - 5 belongs to XYZ group");
	}

}
