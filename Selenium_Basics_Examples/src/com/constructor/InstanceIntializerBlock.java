package com.constructor;

public class InstanceIntializerBlock {
	
	InstanceIntializerBlock()
	{
		System.out.println("This is the default constructor");
	}
	
	InstanceIntializerBlock(int i,int j)
	{
		int k=i+j;
		System.out.println(k);
		System.out.println("This is the two arguments constructor");
	}
	
	InstanceIntializerBlock(int i,int j,int k)
	{
		int w=i+j+k;
		System.out.println(w);
		System.out.println("This is the three arguments constructor");
	}
}

class child extends InstanceIntializerBlock
{
	static int i=10;
	
	int speed;
	
	{
		speed=100;
		System.out.println("The speed of the car is"+speed);
	}
	
	static void m1()
	{
		System.out.println("This is the static method");
	}
	
	child()
	{
		System.out.println("This is the child constructor");
	}	
	
	public static void main(String[] args) { 
		
		child c1=new child();
	}

}
