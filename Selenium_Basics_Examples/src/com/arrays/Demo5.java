package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Demo5 {

	public static void main(String[] args) 
	{
		   String[] s1 = {"Z","A","B"};
		   
		   for(String s2:s1)
		   {
			  System.out.println(s2); 
		   }
		   
		  List l = Arrays.asList(s1);
		  
		  System.out.println(l);
		  
		  l.set(0, "N");
		  
		  for(String s2:s1)
		   {
			  System.out.println(s2); 
		   }
		  
  		   s1[0] = "Z";
   		   
  		   System.out.println(l);
		  
		  // l.add("H");  //java.lang.UnsupportedOperationException
		  
		  // l.set(1,new Integer(10)); //java.lang.ArrayStoreException
  		   
  		   String s3 = "Sai^Siva";
  		   
  		   String[] arrS3 = s3.split("\\^");
  		   
  		   System.out.println(arrS3[0]);
	}

}
