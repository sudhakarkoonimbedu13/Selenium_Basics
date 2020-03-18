package com.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 
{

	public static void main(String[] args) 
	{
		
		PriorityQueue p = new PriorityQueue();
		
		for(int i=0;i<10;i++)
		{
			p.offer(i);
		}
		
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
		System.out.println(p.remove());
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p);
		System.out.println(p.element());
		System.out.println(p);
	}

}
