package com.constructor;

public class Example3 {
	
	 Example3()
	  {
		 this(10); 
		 System.out.println("This is no-arg constructor");		  
	  }
	 
	 Example3(int i)
	 {
		 super();  //if we write this() in place of super() then we will compile time error saying Recursive constructor invocation
		 System.out.println("This is one arg constructor");
	 }
	  

	public static void main(String[] args) 
	{

		Example3 s1 = new Example3();
	}

}
