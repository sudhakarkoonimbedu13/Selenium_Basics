package com.markerinterfaces;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializable1 implements Serializable
{
    String name;
    int age;
    
    
	Serializable1(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) throws IOException 
	{
		
		Serializable1 s1 = new Serializable1("Saravanabava",1000);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\dt204684\\Desktop\\abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);		
		
	}

}
