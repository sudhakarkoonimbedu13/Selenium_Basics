package com.callbyvalue;

public class CallByExample {
	
	int data=100;
	public void m1(int data)
	{
		data=data+100;
	}
	
	public void m1(CallByExample op)
	{
		op.data=op.data+100;
	}

	public static void main(String[] args) 
	{
	    System.out.println("Call By Value");
		CallByExample s1=new CallByExample();
		System.out.println(s1.data);
		s1.m1(100);
		System.out.println(s1.data);
		
		System.out.println("Call By Reference");
		CallByExample s2=new CallByExample();
		System.out.println(s2.data);
		s2.m1(s2);
		System.out.println(s2.data);
		
	}

}
