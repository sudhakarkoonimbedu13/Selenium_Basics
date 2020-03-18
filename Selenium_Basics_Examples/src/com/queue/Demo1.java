package com.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo1 {

	public static void main(String[] args) 
	{
		Queue q = new LinkedList();		
		
		q.offer("A");
		q.offer("B");
		q.offer("C");
		q.offer(null);
		
		System.out.println(q);
		
		System.out.println(q.poll());
		
		System.out.println(q);
		
		System.out.println(q.remove()); // If Queue is empty then it through RE saying "No Such Element Exception"
		
		System.out.println(q);
		
		System.out.println(q.peek()); // To return head element
		
		System.out.println(q.element()); // To return head element and through RE saying "No Such Element Exception" if Queue is empty
		
		
		Queue q1 = new LinkedList();
		
		System.out.println(q1.poll());
		
		//System.out.println(q1.remove());
		
		System.out.println(q1.peek());
		
		//System.out.println(q1.element());

	}

}
