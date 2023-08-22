package com.Core.Java.JDK8.StreamAPI.CollectionMap.Coding;
import java.util.*;
public class LinkedListToArrayList {
	public static void main(String[] args) {
		LinkedList<Integer> ls=new LinkedList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		
		System.out.println(ls.getClass());
		
		ArrayList<Integer> al=new ArrayList<>(ls);
		System.out.println(al.getClass());
		for(int i:al)
		{
			System.out.println(i);
		}
		
	}

}
