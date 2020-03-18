package com.treeset;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo9 {

	public static void main(String[] args) 
	{
		List list = new ArrayList();
		
		list.add("caffeine");
		list.add("café");
		list.add("cafeteria");
		Collections.sort(list);
		
		System.out.println(list);
		
		Collator c = Collator.getInstance();
		Collections.sort(list, c);
		
		System.out.println(list);
	}

}
