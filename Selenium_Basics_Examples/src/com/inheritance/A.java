package com.inheritance;

public class A {

int i=10;
int j=20;

public void sum()
{
	int k=i+j;
	System.out.println(k);
}

public void sum(int x,int y)
{
	int z=x+y;
	System.out.println(z);
}

public void sumAll()
{
	System.out.println("Parent Class A");
}

}
