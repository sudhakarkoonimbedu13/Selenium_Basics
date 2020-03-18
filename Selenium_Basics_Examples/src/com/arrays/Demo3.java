package com.arrays;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) 
	{
	   int[] i1 = {50,40,10,20,30,60};
		   
	   for(int s1:i1)
		 {
		   System.out.println(s1); 
		 }
	   
	   System.out.println("After Sorting....");
	   
	   Arrays.sort(i1);
	   
	   for(int s1:i1)
	   {
		  System.out.println(s1); 
	   }
	   
	   System.out.println(Arrays.binarySearch(i1,40)); // {10, 20, 30, 40, 50, 60}
	                                                   //  0   1   2   3   4   5 (Output: 3) 
	   
	                                                   //  -1  -2  -3  -4  -5  -6  -7
	   System.out.println(Arrays.binarySearch(i1,70)); // {10, 20, 30, 40, 50, 60}
	   
	}

}
