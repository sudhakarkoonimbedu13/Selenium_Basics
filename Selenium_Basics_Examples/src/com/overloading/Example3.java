package com.overloading;

public class Example3 {
	
	public void printMsg(int i,float j)
	{
	   System.out.println("int-float argument");
	}
	
	public void printMsg(float f,int j)
	{
		System.out.println("float-int argument");
	}

	public static void main(String[] args) 
	{
		Example3 s1=new Example3();
		s1.printMsg(10,10.5f);
		s1.printMsg(10.5f,10);
        //s1.printMsg(10,10); //The method printMsg(int, float) is ambiguous for the type Example3
		//s1.printMsg(10.5f,10.5f); //The method printMsg(float, int) in the type Example3 is not applicable for the arguments (float, float)
	}

}
