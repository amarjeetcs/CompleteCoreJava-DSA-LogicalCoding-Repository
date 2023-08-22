package com.Core.Java.JDK8.StreamAPI.OperationOnCollectionAndMap;

import java.util.*;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add(1);
		hs.add(1.5);
		hs.add(1.5);
		hs.add(true);
		hs.add(null);
		hs.add("amarjeet");
		// HashSet duplicates are not allowed
		// insertion order is preserved
		// null insertion is possible
		// can store hetrogenious data
		// HashSet default capacity is 16
		// load factor is 0.75
		// it is better option for searching
		// uses data structure hashtable so it is store data in hashcode
		System.out.println(hs);
		System.out.println(hs);
		for (int i = 0; i < hs.size(); i++) {
			System.out.println(hs);
		}
	}

}
