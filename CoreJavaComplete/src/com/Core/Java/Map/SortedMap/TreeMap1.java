package com.Core.Java.Map.SortedMap;
import java.util.*;
public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap t= new TreeMap<>();
		t.put(1, 1);
		t.put(2, 2);
		t.put(5, 6);
		t.put(3, 2);
		t.put(6, null);
		t.put(7, "sankjeet");
		//t.put(null, null);
		//t.put(null, "sdanket");
		System.out.println(t);
		//TreeMap:
		//->TreeMap implements SortedMap interface.
		//->TreeMap store data in asce order.
		//->TreeMap does not have null key but have mutiple null values.
		//->null insertion not possible
		for(Object o:t.values())
		{
			System.out.println("this will print values:"+o);
		}
		
		for(Object o1:t.keySet())
		{
			System.out.println("this will print keyset:"+o1);
		}
		
		for(Object ob:t.entrySet())
		{
			System.out.println(ob);
		}
	}

}
