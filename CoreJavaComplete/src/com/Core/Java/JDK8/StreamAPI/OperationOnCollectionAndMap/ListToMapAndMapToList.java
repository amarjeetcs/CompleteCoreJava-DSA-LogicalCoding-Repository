package com.Core.Java.JDK8.StreamAPI.OperationOnCollectionAndMap;
import java.util.*;
import java.util.Map.Entry;
public class ListToMapAndMapToList {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add("amarjeet");
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		HashMap hm=new HashMap<>();
		 Map<Object, Object> map = new HashMap<>();
	        for (Object element : al) {
	            map.put(element,element);
	        }
		System.out.println(map);
		
		
		HashMap<Object,Object> hm1=new HashMap<>();
		hm1.put(1, "amarjeet");
		hm1.put(2, "sanjeet");
		hm1.put(4, "rakesh");
		hm1.put(5, "vikash");
		hm1.put(3, "neha");
		
		System.out.println(hm1);
		
		ArrayList<Object> al1=new ArrayList<>();
		for (Entry<Object, Object> entry : hm1.entrySet()) {
            al1.add(entry);
        }
		System.out.println(al1);
		
	}
}
