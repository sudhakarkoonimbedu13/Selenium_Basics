package com.constructor;

import java.net.PasswordAuthentication;

public class ParamConstructor {
	
	ParamConstructor(int i,int j)
	{
		int k=i+j;
		System.out.println(k);
	}
	public static void main(String[] args) 
	{
		
		// ParamConstructor obj=new ParamConstructor(); It will throw error because our class doesn't contain default constructor.
		// Constructors cannot be abstract,final,static and synchronized while methodes can be.
		// When we don't implement any constructor in our class, then compiler inserts default constructor in our code.
		// If we remove parameterized constructor in our class, then compiler inserts the default constructor and it should run fine with out any error.
		
		ParamConstructor obj=new ParamConstructor(10,20);
	}

}
