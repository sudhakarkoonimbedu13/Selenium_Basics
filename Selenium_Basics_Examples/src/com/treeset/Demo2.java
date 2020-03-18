package com.treeset;

import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args)	{

//**********Scenario - 1*************************************		
	   TreeSet t1 = new TreeSet();
	   
	   t1.add("A");
	   t1.add(null);
	   t1.add("B");
	   t1.add("C");
	   t1.add("D");
	   
	   System.out.println(t1);
//************************************************************
	   
//**********Scenario - 2**************************************	   
// Note: Till 1.6 Version we can add null value as first element in TreeSet.
//		 But from 1.7 Version onwards if we are trying to add null as first element then we will get RE: NullPointerException
	   
	   TreeSet t2 = new TreeSet();
	   
	   t2.add(null);
	   t2.add("A");
	   t2.add("B");
	   t2.add("C");
	   t2.add("D");
	   
	   System.out.println(t2);
	}

}
