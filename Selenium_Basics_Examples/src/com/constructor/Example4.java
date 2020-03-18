package com.constructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;

import javax.print.Doc;

import org.omg.SendingContext.RunTime;

public class Example4 
{
  public Example4()
  {
	  
  }
  
  public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException
  {
	  // Using new keyword to create an object
	  Example4 s1 = new Example4();
	  
	  
	  //Object s2 = (Example4)class.forName("Example4").newInstance();
	  
	  // Using Factory methods
	  Runtime r1 = Runtime.getRuntime();
	  
	  DateFormat df = DateFormat.getInstance();
	  
	  // Using clone method
	  Example4 s3 = new Example4();
	  Example4 s4 = (Example4)s3.clone();
	  
	  // Using De-serialization
	  FileInputStream fs = new FileInputStream("");
	  ObjectInputStream ois = new ObjectInputStream(fs);
	  Doc d2 = (Doc)ois.readObject();
	  
  }
}

