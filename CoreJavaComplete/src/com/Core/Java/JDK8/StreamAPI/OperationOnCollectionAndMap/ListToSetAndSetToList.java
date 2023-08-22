package com.Core.Java.JDK8.StreamAPI.OperationOnCollectionAndMap;
//Java program to demonstrate conversion of
//list to set using constructor
import java.util.*;
import java.util.stream.Collectors;

class ListToSetAndSetToList {
	public static void main(String[] args)
	{

		ArrayList al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		System.out.println(al.getClass());
		
		HashSet hs=new HashSet<>(al);
		System.out.println(hs.getClass());
		
		HashSet<Object> set = (HashSet<Object>) hs.stream().collect(Collectors.toSet());
		System.out.println(set.getClass());

		
	}
}
