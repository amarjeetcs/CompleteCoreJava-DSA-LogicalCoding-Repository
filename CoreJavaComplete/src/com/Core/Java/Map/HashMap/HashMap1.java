package com.Core.Java.Map.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "amarjeet");
		hm.put(4, "sunil");
		hm.put(5, "eleven");
		hm.put(2, "sunil");
		hm.put(3, "sunil");
		hm.put(5, "eleven11");
		hm.put(null, null);
		hm.put(10, null);
		//underlying data structure is HashTable
		//duplicates keys are not allowed but duplicate value is allowed
		//insertion order is  not preserved
		//only one null key is allowed
		//multiple null value is allowed
		//hetrogenious data possible
		
		System.out.println(hm);
//		
//		System.out.println(hm.get(5));
//		System.out.println(hm.containsKey(5));
//		System.out.println(hm.containsValue("abhishek"));
//		System.out.println(hm.remove(9));
//		System.out.println(hm);
//		System.out.println(hm.remove(null));
//		System.out.println(hm);
//		System.out.println(hm.remove(10));
//		System.out.println(hm);
//		System.out.println(hm.isEmpty());
//		System.out.println("keys: "+hm.keySet());
//		System.out.println("values: "+hm.values());
//		System.out.println("entry set:"+hm.entrySet());
//		
//		System.out.println("keys:");
//		for(Object o:hm.keySet())
//		{
//			System.out.println(o);
//		}
//		System.out.println("------------------------------------");
//		System.out.println("values");
//		for(Object o1:hm.values())
//		{
//			System.out.println(o1);
//		}
//		
//		System.out.println("-------------------------------------");
//		
//		
//		for(Object o3:hm.values())
//		{
//			System.out.println(o3);
//		}
//		System.out.println("------------------------------------");
//		for(Object o3:hm.keySet())
//		{
//			System.out.println(o3+"    "+hm.get(o3));
//			
//		}
//		System.out.println("------------------------------------");
//		
//		//Entry interface
//		
//		for(Entry<Integer, String> entry:hm.entrySet())
//		{
//			System.out.println(entry.getKey()+"   "+entry.getValue());
//		}
//		HashMap h=new HashMap<>();
//		h.put(12, "eleven");
//		h.put("twelve", 123);
//		System.out.println(h);
//		
//		
//		System.out.println("*******************");
//		//apna coding
//		
//		HashMap<Integer,String> map=new HashMap<>();
//		map.put(1, "Amarjeet");
//		map.put(2, "aniket");
//		map.put(3, "pandit");
//		
//		System.out.println(map);
//		System.out.println(map.keySet());
//		System.out.println(map.values());
//		System.out.println("******************");
//		HashMap<String, Integer> map1=new HashMap<>();
//		map1.put("amarjeet",1);
//		map1.put("aniket", 2);
//		System.out.println(map1);
	}
}
