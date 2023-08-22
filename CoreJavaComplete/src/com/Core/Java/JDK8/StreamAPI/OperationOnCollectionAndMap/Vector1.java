package com.Core.Java.JDK8.StreamAPI.OperationOnCollectionAndMap;
import java.util.*;
public class Vector1 {
	public static void main(String[] args) {
		Vector v=new Vector<>();
		v.add(1);
		v.add(1);
		v.add(1.5);
		v.add("amarjeet");
		v.add(null);
		v.add(null);
		v.add("amarjeet");
		v.add(null);
		v.add(null);
		v.add("amarjeet");
		v.add("amarjeet");
		
		System.out.println(v);
		System.out.println("print using for loop:");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("print using for loop advance:");
		for(Object obj:v)
		{
			System.out.println(obj);
		}
		System.out.println("print using forEach:");
		v.forEach(e->System.out.println(e));
		
		System.out.println("print using Enumuration:");
		Enumeration<Object> em=v.elements();
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
		System.out.println("print using stream api:");
		v.stream().forEach(e->System.out.println(e));
		//vector is synchronized 
		//vector class is legecy class
		//vector class uses rendom access interface
		//retrival operation is fast
		//default capacity is 10 and incresses its size by 100%
		System.out.println(v.capacity());
		
		System.out.println("print using iterator:");
		Iterator<Object> itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}

}
