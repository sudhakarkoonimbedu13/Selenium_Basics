package com.string;

public class Example8 {

	int id;
	String name;
	String location;
	
	Example8(int id,String name,String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;
	}
	
	public String toString()
	{
		return id+" "+name+" "+location;
	}
	
	public static void main(String[] args) 
	{
		Example8 s1 = new Example8(101,"Sai","Hyderabad");
		Example8 s2 = new Example8(102,"Ram","Chennai");
		
		System.out.println(s1);
		System.out.println(s2);	

	}

}
