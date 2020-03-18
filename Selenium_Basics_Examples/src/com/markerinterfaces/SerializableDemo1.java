package com.markerinterfaces;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDemo1 implements Serializable
{
    String name;
    int age;
    
    SerializableDemo1(String name,int age)
    {
    	this.name = name;
    	this.age = age;
    }
	public static void main(String[] args) throws Exception, ClassNotFoundException 
	{
		SerializableDemo1 s1 = new SerializableDemo1("Sai",20);
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		
		System.out.println("########################################################");
		
		FileOutputStream fo = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		oos.writeObject(s1);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializableDemo1 s2 = (SerializableDemo1)ois.readObject();
		
		System.out.println(s2.name);
		System.out.println(s2.age);
       
	}

}
