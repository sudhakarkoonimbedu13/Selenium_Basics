// There is no copy constructor in java. But we can copy the values of one object into another object with following approach
// By using Constructor
// By assigning values of one object into another
// By using clone method of Object Class



package com.constructor;

public class CopyConstructor1 {
	
	int rollNumber;
	String studentName;
	
	CopyConstructor1(int i,String s)
	{
		this.rollNumber=i;
		this.studentName=s;
	}
	
	CopyConstructor1(CopyConstructor1 c2)
	{
		this.rollNumber=c2.rollNumber;
		this.studentName=c2.studentName;
	}
	
	public void display()
	{
		System.out.println(rollNumber+"------"+studentName);
	}
	

	public static void main(String[] args) 
	{
		
		CopyConstructor1 s1=new CopyConstructor1(101,"Sai");
		CopyConstructor1 s2=new CopyConstructor1(s1);
		s1.display();
		s2.display();
	}

}
