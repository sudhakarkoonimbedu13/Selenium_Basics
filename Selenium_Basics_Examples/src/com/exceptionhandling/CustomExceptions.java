package com.exceptionhandling;

import java.util.Scanner;


public class CustomExceptions 
 {

	public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.nextLine();
        int age = Integer.parseInt(s);
        if(age < 14)
        {        	
            throw new TooYoungException("Your age is too young...so wait for some more time for the right match");
        }
        else if(age>60)
        {
        	throw new TooOldException("Your age is too old...you have already crossed the marriage age");
        }
        else
        {
        	System.out.println("You will definately get good match soon....");
        }

	}

}
