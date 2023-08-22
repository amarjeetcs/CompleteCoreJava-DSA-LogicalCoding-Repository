package com.Core.Java.JDK8.StreamAPI.Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapUses {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3,4,5,6);
		List<Integer> l1=l.stream().map(e->e+10).collect(Collectors.toList());
		System.out.println(l1);
		
		List<Integer> list1=Arrays.asList(1,2);
		List<Integer> list2=Arrays.asList(3,4);
		List<Integer> list3=Arrays.asList(5,6);
		
		
		List<List<Integer>> finalList=Arrays.asList(list1,list2,list3);
		List<Integer> fs=finalList.stream().flatMap(e->e.stream().map(e1->e1+10)).collect(Collectors.toList());
		System.out.println(fs);
	}

}
