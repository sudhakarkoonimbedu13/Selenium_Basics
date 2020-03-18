package com.abstraction;

abstract class Example2 {
	
    abstract int getInterestRate();

}

class SBI extends Example2
{
	int getInterestRate()
	{
		return 7;
	}
}

class HDFC extends Example2
{
	int getInterestRate()
	{
		return 6;
	}
}

class Bank {
	public static void main(String[] args)
	{
		Example2 s1=new SBI();
		Example2 s2=new HDFC();
		System.out.println(s1.getInterestRate());
		System.out.println(s2.getInterestRate());
	}
}
