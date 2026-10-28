package com.list;
import java.util.*;

public class Vector_
{

	public static void main(String[] args)
	{
		Vector v1=new Vector();
		v1.add(98);
		v1.add('A');
		v1.add(2.3);
		
//		Iterator i1=v1.iterator();
//		while(i1.hasNext())
//		{
//			System.out.println(i1.next());
//		}
//		ListIterator l1=v1.listIterator();
//		while(l1.hasNext())
//		{
//			System.out.println(l1.next());
//		}
		Enumeration e1=v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	}

}
