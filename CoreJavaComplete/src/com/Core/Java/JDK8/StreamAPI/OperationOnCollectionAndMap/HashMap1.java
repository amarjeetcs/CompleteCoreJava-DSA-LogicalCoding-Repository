package com.Core.Java.JDK8.StreamAPI.OperationOnCollectionAndMap;

import java.util.*;
import java.util.Map.Entry;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap hm = new HashMap<>();
		hm.put(1, "Amarjeet");
		hm.put(2, true);
		hm.put(null, null);
		hm.put(7, null);
		hm.put(3, 100);
		hm.put(4, "Sanjeet");
		hm.put(5, 10.5);
		hm.put(6, 10.5);
		
		
		
		
		
		// insertion order is not preserved
		// hetrogenious data allowed
		// can insert only one null key and multiple null values
		// uses hashtable data structure to store data
		// duplicate keys are not allowd but duplicate values are allowed
		// default capacity is 16
		System.out.println(hm.entrySet());

		System.out.println("print using iterator:");
		Iterator<Map.Entry<Object, Object>> itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Object, Object> map = itr.next();
			System.out.println(map);
		}
		System.out.println("-----------------------------");

		System.out.println("print keys using iterator:");
		Iterator<Object> itr1 = hm.keySet().iterator();
		while (itr1.hasNext()) {
			Object key = itr1.next();
			System.out.println(key);
		}
		System.out.println("-----------------------------");
		System.out.println("print values using iterator:");
		Iterator<Object> itr2 = hm.values().iterator();
		while (itr2.hasNext()) {
			Object value = itr2.next();
			System.out.println(value);
		}
		
		System.out.println("-----------------------------");
		System.out.println("print using keyset: for loop");
		for (Object key : hm.keySet()) {
			System.out.println(key);
		}
		System.out.println("-----------------------------");
		System.out.println("print using value for loop:");
		for (Object value : hm.values()) {
			System.out.println(value);
		}
		
		
		
	}

}
