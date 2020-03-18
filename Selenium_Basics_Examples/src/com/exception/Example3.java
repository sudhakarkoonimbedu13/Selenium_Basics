package com.exception;

public class Example3 {

	public static void main(String[] args) 
	{
		try
		{
			String s1=null;
			System.out.println(s1.length());
			int i=10/0;
			String s2="abc";
			int j=Integer.parseInt(s2);
		}
		catch(NumberFormatException e1)
		{
			System.out.println("Number Format Exception" +e1.getMessage());
		}
		catch(NullPointerException e2)
		{
			System.out.println("Null Pointer Exception:" +e2.getMessage());
		}
		catch(ArithmeticException e3)
		{
			System.out.println("ArithmeticException" +e3.getMessage());
		}
		catch(Exception e4)
		{
			System.out.println("Normal Exception" +e4.getMessage());
		}

		finally
		{
			System.out.println("Finally statement");
		}
		
		System.out.println("End of statement");				

	}

}
