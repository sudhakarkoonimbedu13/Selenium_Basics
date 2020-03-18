package com.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class Employee //implements Comparable
 {
   int empID;
   String empName;
   String empLocation;
   
   Employee(int empID,String empName,String empLocation)
   {
	   this.empID = empID;
	   this.empName = empName;
	   this.empLocation = empLocation;
   }
   
   public String toString()
   {
	   return (empID+"----"+empName+"----"+empLocation);
   }
   
   public int compareTo(Object obj2)
   {
	  int empId1 = this.empID;
	  Employee emp = (Employee)obj2;
	  
	  int empId2 = (Integer)emp.empID;
	  
	  if(empId1<empId2)
	  {
		return -1;  
	  }
	  else if(empId1>empId2)
	  {
		  return +1;
	  }
	  else
	  {
		  return 0;
	  }
	   
   }
   
 }

class Demo8
{
   
   public static void main(String[] args)
   {
	   Employee t1 = new Employee(101,"Sai","Hyd");
	   Employee t2 = new Employee(102,"Shiv","Chn");
	   Employee t3 = new Employee(103,"Muruga","Pln");
   
       TreeSet tr1 = new TreeSet();
   
       tr1.add(t1);
       tr1.add(t2);
       tr1.add(t3);
       
       System.out.println(tr1);
       
       TreeSet tr2 = new TreeSet(new custComparator());
       
       tr2.add(t1);
       tr2.add(t2);
       tr2.add(t3);
       
       System.out.println(tr2);
   
   }

}


class custComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
	   Employee ename1 = (Employee)obj1;
	   Employee ename2 = (Employee)obj2;
	   
	   String empName1 = ename1.empName.toString();
	   String empName2 = ename2.empName.toString();
	   
	   return empName1.compareTo(empName2);
	}
}