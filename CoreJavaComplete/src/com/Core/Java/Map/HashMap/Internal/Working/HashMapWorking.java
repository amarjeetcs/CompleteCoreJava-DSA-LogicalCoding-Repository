package com.Core.Java.Map.HashMap.Internal.Working;

import java.util.*;
import java.util.HashMap;

public class HashMapWorking {
	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 500);
		marks.put(null, 600);
		System.out.println(marks);

		// for the put operation steps
		// it will create 16 size of bucket in memory
		/*
		 * public V put(K key, V value) { int hash=hashCode(key); int index=hash &(n-1);
		 * }
		 */
		// based on the given key it will generatge the hashcode
		// based on the hashcode we will get index to insert data
		// data will be insert in the form of key,hashcode,value,next
		// if multiple objects have same hash code then index will be the same and it is
		// called hash collisen

		// for the get operation steps
		// based on the key will generate the hashcode
		// based on the hashcode will get index
		// once index we got then we will check the content with .equals()
		// if multiple keys have same hash code then based on .equals() will check
		// content and fetch the data
		// always for null key index will be 0th position

	}
}