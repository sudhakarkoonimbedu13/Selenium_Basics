package com.markerinterfaces;

public class ClonableDemo1 implements Cloneable
{
  String name;
  int age;
  
  ClonableDemo1(String name,int age)
  {
	  this.name = name;
	  this.age = age;
  }
  
  public static void main(String[] args) throws CloneNotSupportedException 
	{
	  ClonableDemo1 s1 = new ClonableDemo1("Sundar",30);
	  ClonableDemo1 s2 = (ClonableDemo1) s1.clone();
      System.out.println(s1.name+"---"+s1.age);
      System.out.println(s2.name+"---"+s2.age);
	}

}
