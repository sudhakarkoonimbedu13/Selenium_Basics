package com.constructor;

public class CopyConstructor2 {
	
	int rollNumber;
	String studentName;
	
	CopyConstructor2()
	{
		
	}
	
	CopyConstructor2(int i,String s)
	{
		this.rollNumber=i;
		this.studentName=s;
	}
	
	public void display()
	{
		System.out.println(rollNumber+"------"+studentName);
	}
	

	public static void main(String[] args) 
	{
		
		CopyConstructor2 s1=new CopyConstructor2(101,"Sai");
		CopyConstructor2 s2=new CopyConstructor2();
		s2.rollNumber=s1.rollNumber;
		s2.studentName=s1.studentName;
		s1.display();
		s2.display();
	}

}
