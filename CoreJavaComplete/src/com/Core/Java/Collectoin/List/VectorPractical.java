package com.Core.Java.Collectoin.List;
import java.util.*;
public class VectorPractical {
	public static void main(String[] args) {
		Vector v=new Vector<>();
		v.add(1);
		v.add(2);
		v.add("amarjeet");
		v.add(10.23);
		
	
		Enumeration<Object> en=v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		System.out.println("------------------------------");
		Iterator<Object> itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-------------------------------");
		ListIterator<Object> l=v.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		//vector is old class or legecy class
		//vector incresses its size by 100%
		//vector methods are synchronized
		//vector initial capacity is 10
		//use vector when our operation is to retrive the data drom list
		//vector implements random access interface
		
	}

}
