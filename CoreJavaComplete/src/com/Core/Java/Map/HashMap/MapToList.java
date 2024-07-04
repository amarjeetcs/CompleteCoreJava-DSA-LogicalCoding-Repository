package com.Core.Java.Map.HashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer, String>();
		m.put(1, "amarjet");
		m.put(2, "sanjeet");
		m.put(3, "ranjeet");
		m.put(4, "rajnish");
		m.put(5, "vishwjeet");
		
		//converting using stream api
		List<Integer> ListOfKeys=null;
		List<String> ListOfValues=null;
		
		
		ListOfKeys=m.keySet().stream().collect(Collectors.toList());
		System.out.println(ListOfKeys);
		
		ListOfValues=m.values().stream().collect(Collectors.toList());
		System.out.println(ListOfValues);
		
		List<Map.Entry<Integer, String>> collectMap=m.entrySet().stream().collect(Collectors.toList());
		System.out.println(collectMap);
		
		
		
		
		
		
	}
}
