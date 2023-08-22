package com.Core.Java.JDK8.StreamAPI.CollectionMap.Coding;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;
public class SortMapKeys {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(23,"A");
		hm.put(22, "C");
		hm.put(55, "B");
		hm.put(11, "D");
		hm.put(10, "E");
		
//		for(Integer i:hm.keySet())
//		{
//			System.out.println(i);
//		}
		
		System.out.println("sorted keys: ");
		hm.keySet().stream().sorted().forEach(e->System.out.println(e));
		System.out.println("sorted values: ");
		hm.values().stream().sorted().forEach(e->System.out.println(e));
		
		System.out.println("---------------------");
		for(Object obj:hm.entrySet())
		{
			System.out.println(obj);
		}
	}

}
