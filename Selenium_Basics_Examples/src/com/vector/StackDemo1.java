package com.vector;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) 
	{
		Stack s = new Stack();
		
		System.out.println(s.size());
		
		s.push("Test1");
		s.push("Test2");
		s.push("Test3");
		
		System.out.println(s);
		
		System.out.println(s.peek());
		
		s.pop();
		
		System.out.println(s);
		
		System.out.println(s.search("Test1"));
		System.out.println(s.search("Test2"));
		System.out.println(s.search("Test3"));
		
		System.out.println(s.capacity());

	}

}
