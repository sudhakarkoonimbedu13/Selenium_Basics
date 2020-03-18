package com.arrays;

import java.util.Arrays;
import java.util.Comparator;

class Demo2 {

	public static void main(String[] args) 
	{
	   String[] s1 = {"Z","D","B","A","C","E"};
	   
	   for(String a1:s1)
	   {
		   System.out.println(a1);
	   }
	   
	   System.out.println("After Sorting as per Default Natural Sorting Order...");
	   
	   Arrays.sort(s1);
	   
	   for(String a1:s1)
	   {
		   System.out.println(a1);
	   }
	   
	   System.out.println("After Sorting as per Customized Sorting Order...");
	   
	   Arrays.sort(s1,new MyComparator());
	   
	   for(String a1:s1)
	   {
		   System.out.println(a1);
	   }

	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s3 = obj1.toString();
		String s4 = obj2.toString();
		
		return s4.compareTo(s3);
	}
}
