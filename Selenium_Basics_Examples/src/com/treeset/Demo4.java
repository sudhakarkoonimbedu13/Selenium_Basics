package com.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class Demo4 
{

	public static void main(String[] args) 
	{
		TreeSet t1 = new TreeSet(new comparator());
		
		t1.add(0);
		t1.add(30);
		t1.add(15);
		t1.add(20);
		t1.add(50);
		t1.add(20);
		
		System.out.println(t1);

	}	

}

class comparator implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2) 
	{
       Integer i1 = (Integer)obj1;
       Integer i2 = (Integer)obj2;
       
//       if(i1<i2)
//       {
//    	   return +1;
//       }
//       else if(i1>i2)
//       {
//    	   return -1;
//      }
//       else
//       {
//   	   return 0;
//       }
       
       //Case - 1
       //return i1.compareTo(i2);
      
      //Case - 2 
      //return -i1.compareTo(i2);
       
      //Case - 3
      //return i2.compareTo(i1);
       
      //Case - 4
      //return -i2.compareTo(i1);
       
      //Case - 5 [Insertion order]
      return +1;
       
      //Case - 6 [Reverse of Insertion order]
      //return -1;
      //Case - 7 [Only first element will be inserted and all remaining are duplicates]
      //return 0;
	}
	
}


