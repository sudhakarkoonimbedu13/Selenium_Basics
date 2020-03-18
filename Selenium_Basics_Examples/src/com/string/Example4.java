// String Buffer
package com.string;

public class Example4 
{
  public static void main(String[] args)
  {
	  StringBuffer sb1 = new StringBuffer("Saravana");
	  StringBuffer sb2 = new StringBuffer("Saravana");
	  
	  System.out.println(sb1==sb2);
	  System.out.println(sb1.equals(sb2));
	  
	  // append()
	  System.out.println("**********append()*************");
	  System.out.println(sb1);
	  StringBuffer sb3 = sb1.append("bava");
	  System.out.println(sb3);
	  
	  // insert()
	  System.out.println("**********insert()*************");
	  System.out.println(sb1.insert(0,"Om"));
	  
	  StringBuffer sb4 = new StringBuffer("Saravanabava");
	  
	  // delete()
	  System.out.println("***********delete()************");
	  System.out.println(sb4.delete(8,12));
	  
	  // replace()
	  System.out.println("***********replace()**************");
	  System.out.println(sb4.replace(4, 8, "vanabava"));
	  
	  //capacity()
	  System.out.println("**********capacity()************");
	  System.out.println(sb1.capacity());
	  
	  //ensureCapacity()
	  System.out.println("***********ensureCapacity()**********");
	  sb1.append("bava om kandha kadamba");
	  System.out.println(sb1.capacity());
	  sb1.ensureCapacity(10);
	  System.out.println(sb1.capacity());
	  sb1.ensureCapacity(50);
	  System.out.println(sb1.capacity());	  
	  
  }
}
