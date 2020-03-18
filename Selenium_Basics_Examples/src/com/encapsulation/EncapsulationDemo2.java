package com.encapsulation;

public class EncapsulationDemo2 {

	public static void main(String[] args) 
	{
		EncapsulationDemo1 encapsulation=new EncapsulationDemo1();
		encapsulation.setRollNumber(1001);
		encapsulation.setStudentName("Mahesh");
		encapsulation.setLocation("HYD");
		
		System.out.println(encapsulation.getRollNumber());
		System.out.println(encapsulation.getSudentName());
		System.out.println(encapsulation.getLocation());
		
		encapsulation.marksScoredInMaths=100;
		
		System.out.println(encapsulation.marksScoredInMaths);
		
        // Direct access of rollNumber is not possible
        // due to encapsulation
        // System.out.println("Roll Number: " + encapsulation.rollNumber);  
	}

}
