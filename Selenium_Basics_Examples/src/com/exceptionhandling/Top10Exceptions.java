package com.exceptionhandling;

public class Top10Exceptions 
{
    public static void m1()
    {
    	m2();
    }
    
    public static void m2()
    {
    	m1();
    }
	public static void main(String[] args) 
	{
	  System.out.println("!!!!!!!!!!!!!! JVM Exceptions !!!!!!!!!!!!!!!!!!!!!!!!!!");
	  
	  //1. ArrayIndexOutOfBoundsException
		
	  int[] x = new int[4]; // 0-3
	  try
	  {
	     System.out.println(x[4]);
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
		  System.out.println("**********************************************************");
	  }
	  
	  //2. NullPointerException
	  
	  String s=null;
	  try
	  {
		  System.out.println(s.length());
	  }
	  catch(NullPointerException e)
	  {
		  System.out.println(e);
		  System.out.println("**********************************************************");
	  }
	  
	  //3. ClassCastException
	  
	  Object o = new Object();
	  try
	  {
		  String s1 = (String)o;  
	  }
	  catch(ClassCastException e)
	  {
		  System.out.println(e);
		  System.out.println("**********************************************************");
	  }
	  
	  //4. StackOverFlowError
	  try
	  {
		  m1();
	  }
	  catch(StackOverflowError e)
	  {
		 System.out.println(e);
		 System.out.println("**********************************************************"); 
	  }
	  
	  //5. NoClassDefFoundError
	  //6. ExceptionInInitializerError
	  
	  System.out.println("!!!!!!!!!!!!!! Programmatic Exceptions !!!!!!!!!!!!!!!!!!!!!!!!!!");
	  
	  //7. IllegalArgumentException
	  
	  Thread t = new Thread();
	  try
	  {
		  t.setPriority(15);
	  }
	  catch(IllegalArgumentException e)
	  {
		 System.out.println(e);
		 System.out.println("**********************************************************");   
	  }
	  
	  
	  //8. NumberFormatException
	  
	  try
	  {
		 int i = Integer.parseInt("ten"); 
	  }
	  catch(NumberFormatException e)
	  {
		 System.out.println(e);
		 System.out.println("**********************************************************"); 
	  }	  
	  
	  
	  //9. IllegalStateException
	  
	  Thread t1 = new Thread();
	  t1.start();
	  try
	  {
		  t1.start();
	  }
	  catch(IllegalThreadStateException e)
	  {
		  System.out.println(e);
		  System.out.println("**********************************************************");   
	  }
	  
	  //10. AssertionError
	  
	  int y=10;
	  try
	  {
		  assert(y>20);
	  }
	  catch(AssertionError e)
	  {
		  System.out.println(e);
		  System.out.println("**********************************************************"); 
	  }  
	  

	}

}
