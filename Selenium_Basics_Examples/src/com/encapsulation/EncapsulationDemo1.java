package com.encapsulation;

public class EncapsulationDemo1 {

	private int rollNumber;
	private String studentName;	
	private String location;
	public int marksScoredInMaths;
    
	public int getRollNumber()
	{
		return rollNumber;
	}
	
	public String getSudentName()
	{
		return studentName;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public void setRollNumber(int strRollNumber)
	{
		rollNumber=strRollNumber;
	}
	public void setStudentName(String strStudentName)
	{
		studentName=strStudentName;
	}
	public void setLocation(String strLocation)
	{
		location=strLocation;
	}

}
