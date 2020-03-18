/*Linked List: 
	1. The underline data structure is "Double Linked List"
	2. It allows duplicate values.
	3. Insertion order is preserved.
Advantages:
	It is best suitable when we want to perform insertion or deletion in the middle
Disadvantages:
	It is  not suitable when the frequent operation is retrieval
	
Note:
1. Both ArrayList and Vector implements RandomAccess interface	which is Marker interface
2. LinkedList in used to implement Stack(LIFO) and Queue (FIFO)
*/


package com.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Demo1 {

	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList(); // Stack and Queue implemented by using Linked List
		l.add("Test1");
		l.add("Test2");
		l.add(null);
		l.add("Test3");
		System.out.println(l);
		l.set(0, "Test1Updated");
		System.out.println(l);
		l.add(0, "New Test");
		System.out.println(l);
		l.addLast("Test4");
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
		System.out.println(l.getFirst());
	}

}
