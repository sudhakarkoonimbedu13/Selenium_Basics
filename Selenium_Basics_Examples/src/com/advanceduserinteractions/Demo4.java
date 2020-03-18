package com.advanceduserinteractions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class Demo4 implements Serializable
{

	public static HashMap<String,Object> hmap = null;
	
	
//	public static void main()
//	{
//		Demo3 a = new Demo3();		
//		
//	}
	
	
	public static void readData()
	{
		hmap = new  HashMap<String,Object>();
		
		Demo3 a = new Demo3();
		
		hmap.put("1", a);

	}
	
	
}
