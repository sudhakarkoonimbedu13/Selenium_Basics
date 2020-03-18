
// Under lined data structure is "Balanced Tree"

package com.treeset;

import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) 
	{
//*******************Tree Set Constructors****************************************************		
		TreeSet t1 = new TreeSet();
		
		TreeSet t2 = new TreeSet();
		
		//TreeSet t2 = new TreeSet(Collection c);
	
		//TreeSet t3 = new TreeSet(Comparator c1;)
		
//****************************************************************************************************************************			

//******************* TreeSet allows Homogeneous objects and classes which implements comparable interface********************		
        
		t1.add("A");
        t1.add(new Integer(10));
        t1.add("Z");
        t1.add("G");
        t1.add("H");
        
        System.out.println(t1);
        
//******************************************************************************************************************************  
        
//******************* TreeSet allows classes which implements comparable interface**********************************************        
        
        t2.add(new StringBuffer("A"));
        t2.add(new StringBuffer("B"));
        t2.add(new StringBuffer("C"));
        t2.add(new StringBuffer("D"));
        
        System.out.println(t2); // [In order to check whether the class is implementing Comparable interface or not, In cmd type "javap java.lang.StringBuffer"]
        
//*******************************************************************************************************************************        

	}

}
