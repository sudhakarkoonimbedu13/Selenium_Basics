// If we want to return this keyword as statement from the method, then we should declare the method return type should be class type (non-primitive)
// Syntax return_type methodName()
//{
//	return this;
//}
package com.thiskeyword;

public class Example5 {
	
	Example5 getA()
	{
		return this;
	}
	
	void displayMsg()
	{
		System.out.println("Input Message");
	}

	public static void main(String[] args) 
	{
		
		Example5 s1=new Example5();
		System.out.println(s1.getA());
		s1.getA().displayMsg();
	}

}
