package com.interfaceconcept;


interface i1
{
	void m1();	
}

interface i2
{
	void m2();
}


public class ExampleB1 implements i1,i2{
	
	public void m1()
	{
		System.out.println("This is the m1 method implementation");
	}
	
	public void m2()
	{
		System.out.println("This is the m2 method implementation");
	}

	public static void main(String[] args) 
	{
      ExampleB1 s1=new ExampleB1();
      s1.m1();
      s1.m2();
      
      i1 s2=new ExampleB1();
      s2.m1();
      
      i2 s3=new ExampleB1();
      s3.m2();    
      
      //i1 s4=new i1(); // Cannot instantiate the type i1 (Can't create instance for interface with out using class as runtime object) 
   
	}

}
