package com.exception;

public class Example1 {	

    static String s1=null;
    static String s2="abc";
	public static void main(String[] args) 
	{
     // *********************ArithmeticException*************************************		
	 //	System.out.println(10/0);
		
     // *********************NullPointer Exception***********************************
	 //	System.out.println(s1.length());
		
	 // *********************Number Format Exception*********************************		
	 //	int i=Integer.parseInt(s2);
	 //	System.out.println(i);
	 
	 // *********************Array Index Out Of Bound Exception****************************
		String[] s3=new String[3];
		s3[4]="sdf";	

	}

}
