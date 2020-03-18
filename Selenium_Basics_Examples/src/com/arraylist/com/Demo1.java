/*Array List: 
	1. The underline data structure is "Resized Array or Growable Array"
	2. It allows duplicate values.
	3. Insertion order is preserved.
Advantages:
	It best suitable when the frequent operation is retrieval
Disadvantages:
	It is not suitable when we want to perform insertion or deletion in the middle
Note:
   All Collection classes implements Serializable and Cloneable interfaces*/
	

package com.arraylist.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 
{

	public static void main(String[] args) 
	{
		ArrayList l = new ArrayList();
        System.out.println(l.size());
        l.add("A");
        l.add(10);
        l.add("A");
        l.add(null);
        System.out.println(l.size());
        System.out.println(l);
        l.remove(2);
        System.out.println(l.size());
        System.out.println(l);
        l.add(2, "B");
        System.out.println(l.size());
        System.out.println(l);
        List l1 = Collections.synchronizedList(l); // l is non-synchronized and l1 is synchronized [Synchronized version of ArrayList]
        
        System.out.println(l1);
	}

}
