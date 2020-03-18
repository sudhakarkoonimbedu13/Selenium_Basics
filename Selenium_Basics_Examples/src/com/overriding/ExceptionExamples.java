package com.overriding;
import java.io.*;

// Case:1
class ExceptionExamples
{
   public void m1() throws Exception
   {
	   
   }
}

class ExceptionChild1 extends ExceptionExamples
{
	public void m1()
	{
		
	}
}

// Case:2 (CE: m1() in A2 can't override m1() in A1, overridden method does not throw Exception)

class A1
{
	public void m1()
	{
		
	}	
}

class A2 extends A1
{
//	public void m1() throws Exception
//	{
//		
//	}
}

// Case:3 

class B1
{
	public void m1() throws Exception
	{
		
	}
}

class B2 extends B1 
{
	public void m1() throws IOException
	{
		
	}
}

// Case:4

class C1
{
	public void m1() throws IOException
	{
		
	}
}

class C2 extends C1 
{
	public void m1() throws EOFException,FileNotFoundException
	{
		
	}
}

// Case: 5 (CE: m1() in D2 can't override m1() in D1, overridden method does not throw InterruptedException)

class D1
{
	public void m1() throws IOException
	{
		
	}
}

class D2 extends D1 
{
//	public void m1() throws InterruptedException
//	{
//		
//	}
}

// Case: 6

class E1
{
	public void m1() throws IOException,InterruptedException
	{
		
	}
}

class E2 extends E1 
{
	public void m1() throws EOFException,FileNotFoundException
	{
		
	}
}

// Case:7 (CE: m1() in F2 can't override m1() in F1, overridden method does not throw EOFException)

class F1
{
	public void m1() throws InterruptedException
	{
		
	}
}

class F2 extends F1 
{
//	public void m1() throws EOFException
//	{
//		
//	}
}


// Case:8 (There is no restrictions if child class method has any unchecked exceptions

class G1
{
	public void m1() throws InterruptedException
	{
		
	}
}

class G2 extends G1 
{
	public void m1() throws ArithmeticException,NullPointerException,ClassCastException
	{
		
	}
}

