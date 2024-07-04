package com.Core.Java.JDK8.StreamAPI.Methods;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapUses {
	public static void main(String[] args) {
		/*List<Integer> list=Arrays.asList(1,2,3,4,5);
		List<Integer>l=list.stream().map(e->e*2).collect(Collectors.toList());
		System.out.println(l);
		*/
		
		List<String> list=Arrays.asList("amarjeet","aniket","sanjeet","hira");
		System.out.println(list);
		List<String> listMap=list.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		System.out.println(listMap);
		
		List<Integer> obj=Arrays.asList(1,2,3,4,5);
		List<Integer> listobj=obj.stream().map(e->e*5).collect(Collectors.toList());
		System.out.println(listobj);
		
		//data transafortmation 
		//one to one mapping
		
		
		/*List<String> list=Arrays.asList("nikki","suman","ratan","neha");
		List<String> ls=list.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls);*/
		
		
		
		//map operation is used to transform elements in a stream from one type to another based on a 
		//provided mapping function
	}
}
