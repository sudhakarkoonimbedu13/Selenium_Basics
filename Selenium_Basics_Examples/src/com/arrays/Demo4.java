package com.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Demo4 {

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
	   
	   System.out.println(Arrays.binarySearch(s1, "E"));  // {A, B, C, D, E, Z}
	                                                      //  0  1  2  3  4  5 (Output: 4) 
	   
	                                                      // -1 -2 -3 -4 -5 -6 -7
	   System.out.println(Arrays.binarySearch(s1, "F"));  // {A, B, C, D, E, Z} (Output: -6)
	   
	   System.out.println("After Sorting as per Customized Sorting Order...");
	   
	   Arrays.sort(s1,new MyComparator());
	   
	   for(String a1:s1)
	   {
		   System.out.println(a1);
	   }
	   
	   System.out.println(Arrays.binarySearch(s1, "E",new MyComparator2()));  // {Z, E, D, C, B, A}
                                                                              //  0  1  2  3  4  5 (Output: 1) 

                                                                              // -1 -2 -3 -4 -5 -6 -7
       System.out.println(Arrays.binarySearch(s1, "F",new MyComparator2()));  // {Z, E, D, C, B, A} (Output: -3)
      
      
       // Unpredictable Result
	   for(String a1:s1)
	   {
		   System.out.println(a1);
	   }
	   
	   System.out.println(Arrays.binarySearch(s1, "E"));
       System.out.println(Arrays.binarySearch(s1, "F"));   

	}
}

class MyComparator2 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s3 = obj1.toString();
		String s4 = obj2.toString();
		
		return s4.compareTo(s3);
	}
}