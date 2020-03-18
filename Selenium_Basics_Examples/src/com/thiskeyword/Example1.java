package com.thiskeyword;

public class Example1 {
	double balnaceAmount;
	double depositAmount;
	double totalAmount;
	
	public void sumAll(double balnaceAmount,double depositAmount)
	{
// Output: 0.0-----0.0------300.0 (If we don't declare the variables with this keyword)
//		balnaceAmount=balnaceAmount;
//		depositAmount=depositAmount;    
//		totalAmount=balnaceAmount+depositAmount;
// Output: 100.0-----200.0------300.0
		this.balnaceAmount=balnaceAmount;
		this.depositAmount=depositAmount;    
		totalAmount=this.balnaceAmount+this.depositAmount;
	}
	
	public void display()
	{
		System.out.println(balnaceAmount+"-----"+depositAmount+"------"+totalAmount);
		printMsg();    // By default compiler assign 'this' keyword while invoking the method (this.printMsg())
	}
	
	public void printMsg()
	{
		System.out.println("This is to test the 'this' keyword for method");
		
	}

	public static void main(String[] args) 
	{
		Example1 s1=new Example1();
		s1.sumAll(100,200);
		s1.display();
	}

}
