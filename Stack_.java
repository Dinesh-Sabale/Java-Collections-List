package com.list;
import java.util.*;

public class Stack_ {
	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.push(98);
		s1.push("Sanju");
		s1.push(9.87);
		s1.push('D');
		s1.add(45);
		
//		Iterator i1=s1.iterator();
//		while(i1.hasNext())
//		{
//			System.out.println(i1.next());
//		}
//		
//		ListIterator ll=s1.listIterator();
//		while(ll.hasNext())
//		{
//			System.out.println(ll.next());
//		}
		
		Enumeration ee=s1.elements();
		while(ee.hasMoreElements())
		{
			System.out.println(ee.nextElement());
		}
	}
}
