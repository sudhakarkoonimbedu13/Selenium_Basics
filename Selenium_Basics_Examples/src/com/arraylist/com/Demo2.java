// All Collection classes implements Serializable and Clonable Interfaces
// Only ArrayList and Vector implements RandomAccess Interface


package com.arraylist.com;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class Demo2 
{
   public static void main(String[] args)
   {
	
	   ArrayList l1 = new ArrayList();
	   LinkedList l2 = new LinkedList();
	   
	   System.out.println(l1 instanceof Serializable); 
	   System.out.println(l2 instanceof Serializable);
	   System.out.println(l1 instanceof Cloneable);
	   System.out.println(l2 instanceof Cloneable);
	   System.out.println(l1 instanceof RandomAccess);
	   System.out.println(l2 instanceof RandomAccess);
   }
}
