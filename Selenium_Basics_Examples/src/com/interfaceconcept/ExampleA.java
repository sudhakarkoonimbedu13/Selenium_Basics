package com.interfaceconcept;

interface ExampleA {
	int i=10;
	
	public void m1();
	
	public default void printMsg()
	{
		System.out.println("This is the default method in Interface which is implemented Java 1.8 onwards");
	}
	
	public static int square(int x)
	{
		return x*x;
	}

}

