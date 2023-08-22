package com.Core.Java.JDK8.StreamAPI.CollectionMap.Coding;
import java.util.*;
public class HashSetToLinkedHashSet {
	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<>();
		hs.add(1);
		hs.add(3);
		hs.add(2);
		hs.add(5);
		hs.add(4);
		hs.add(6);
		hs.add(7);
		System.out.println(hs.getClass());
		System.out.println(hs);
		
		LinkedHashSet<Integer> ls=new LinkedHashSet<>(hs);
		System.out.println(ls.getClass());
		System.out.println(ls);
		
	}
}
