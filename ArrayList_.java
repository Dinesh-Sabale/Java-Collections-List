package com.list;
import java.util.*;

public class ArrayList_ {
		public static void main(String args[]) {
			ArrayList<Integer> list=new ArrayList<>();
			list.add(25);
			
//			System.out.println(list.get(0));
			/*
			 * It follows  insertion order.
			 * It allows the  duplicate values.
			 * It also allows the Null values.
			 * It allows random access.
			 */
			ArrayList<Object> mix=new ArrayList<>();
			mix.add(1);
			mix.add("Dinesh");
			mix.add(23);
//			System.out.println("Id of the person is "+mix.get(0));
//			System.out.println("Name of the person is "+mix.get(1));
//			System.out.println("Age of the person is "+mix.get(2));
			
			
//			Iteration of arraylist.
			
			System.out.println("Iteraation using For loop");
			for(int i=0;i<mix.size();i++)
			{
				System.out.println(mix.get(i));
			}
			
			System.out.println("Iteraation using For Each loop");
			for(Object obj:mix)
			{
				System.out.println(obj);
			}
			
			System.out.println("Iteraation using ListIterator");
			ListIterator<Object> itr = mix.listIterator();

			while(itr.hasNext()) {
			    System.out.println(itr.next());
			}
		}
	}


