package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo1 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
	  PrintWriter pw = new PrintWriter("abc.txt");
	  pw.println("Hello");
    }
}
