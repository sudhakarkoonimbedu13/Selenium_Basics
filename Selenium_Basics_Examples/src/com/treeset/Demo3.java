package com.treeset;

import java.util.TreeSet;

public class Demo3 {

	public static void main(String[] args) 
	{
		
		TreeSet t1 = new TreeSet();
		
		t1.add(100);
		t1.add(101);
		t1.add(102);
		t1.add(110);
		t1.add(109);
		t1.add(108);
		t1.add(103);
		t1.add(104);
		t1.add(107);
		t1.add(106);
		t1.add(105);
		
		System.out.println(t1);
		
		System.out.println(t1.first());
		
		System.out.println(t1.last());
		
		System.out.println(t1.headSet(106));  // [ to 106, but not inclusive (by default)]
		
		System.out.println(t1.headSet(106, true)); // [to 106 with inclusive (106)]
		
		System.out.println(t1.tailSet(106)); // [from 106 with inclusive ((by default)
		
		System.out.println(t1.tailSet(106, false)); // [from 106, but not inclusive (106)]
		
		System.out.println(t1.subSet(101, 110)); // [from 101 (with inclusive 101 - by default) to 110, but not inclusive (110 - by default)]
		
		System.out.println(t1.subSet(101,false,110,true)); // [from 101 (not inclusive - 101) to 110 (inclusive - 110)]
		
		System.out.println(t1.subSet(101, true, 110, true)); // [from 101 to 110 with both lower and upper bound inclusive]

	}

}
