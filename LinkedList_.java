package com.list;
import java.util.*;

public class LinkedList_ 
{
	public static void main(String[] args) 
	{
		
		//Conversion of Array to ArrayList
//		int a[]= {10,20,30,40,50};
//		
		ArrayList a1=new ArrayList();
//		
//		for(int i=0;i<a.length;i++)
//		{
//			a1.add(a[i]);
//		}
		
		
//		ArrayList al=new ArrayList();
//		al.add(98);
//		al.add("Dinesh");
//		al.add(2.3);
//		System.out.println(al.contains(98));
//		System.out.println(al.hashCode());
		
		LinkedList li=new LinkedList();
		li.add(1);
		li.add("Dinesh");
		li.add(23);
		li.add("Male");
		
		a1.addAll(li);
		
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		ListIterator l1=a1.listIterator(a1.size());
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
		
	}
}
