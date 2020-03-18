package com.markerinterfaces;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Serializable2 implements Serializable
{
	Serializable1 serializable1;
	
	public static void main(String[] args) throws ClassNotFoundException, IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\dt204684\\Desktop\\abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Serializable1 s2 = (Serializable1)ois.readObject();
		
       System.out.println(s2.name);
       System.out.println(s2.age);

	}

}
