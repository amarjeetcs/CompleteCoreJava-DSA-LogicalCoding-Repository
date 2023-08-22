package com.Core.Java.JDK8.StreamAPI.OperationOnCollectionAndMap;
import java.util.*;
public class Stack1 {
	public static void main(String[] args) {
		Stack s=new Stack<>();
		s.add(1);
		s.add(2);
		s.add(1);
		s.add(2);
		s.add(1);
		s.add(2);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		
		Enumeration<Object> em=s.elements();
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
		
		System.out.println("using iterator:");
		Iterator<Object> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
