package com.Core.Java.JDK8.StreamAPI.CollectionMap.Coding;
import java.util.*;
public class ArrayListToLinkedList {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al.getClass());
		LinkedList<Integer> ls=new LinkedList<>(al);
		System.out.println(ls.getClass());
		for(int i:ls)
		{
			System.out.println(i);
		}
		
	}
}
