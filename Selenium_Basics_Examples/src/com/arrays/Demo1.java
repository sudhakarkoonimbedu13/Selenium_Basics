package com.arrays;

import java.util.Arrays;

public class Demo1 
{
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
	   
	   
   }
}
