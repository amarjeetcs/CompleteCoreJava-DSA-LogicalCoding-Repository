package com.Core.Java.JDK8.StreamAPI.OperationOnCollectionAndMap;

import java.util.*;
import java.util.stream.Collectors;

public class StramApiUsingMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "Amarjeet");
		map.put(102, "Sanjeet");
		map.put(106, "Amarjeet Singh Rajput");
		map.put(103, "Neha");
		map.put(104, "Hira");
		map.put(105, "Rajnish");
		map.keySet().stream().forEach(e -> System.out.println("Pringing only keys :" + e));
		System.out.println("----------------------------------------------------");
		map.values().stream().forEach(e -> System.out.println("Printing only values: " + e));
		System.out.println("----------------------------------------------------");
		map.keySet().stream().map(e1 -> e1 + 1).forEach(e -> System.out.println("adding 1 to keys: " + e));
		System.out.println("----------------------------------------------------");
		map.values().stream().filter(e -> e.startsWith("A") && e.endsWith("t"))
				.forEach(e -> System.out.println("Printing start with A and Ends With t: " + e));
		System.out.println("----------------------------------------------------");
		map.values().stream().map(e -> e.toUpperCase())
				.forEach(e -> System.out.println("Converting all values in upper case: " + e));
		System.out.println("----------------------------------------------------");
		map.entrySet().stream().forEach(e->System.out.println("printing key and value pair: "+e));
		System.out.println("----------------------------------------------------");
		for(Object ob:map.entrySet())
		{
			System.out.println("printing using for each: "+ob);
		}
		System.out.println("----------------------------------------------------");
		

	}

}
