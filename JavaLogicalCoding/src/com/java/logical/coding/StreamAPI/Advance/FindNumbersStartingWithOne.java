package com.java.logical.coding.StreamAPI.Advance;

import java.util.stream.Collectors;
import java.util.*;
public class FindNumbersStartingWithOne {
	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(10,11,12,13,14,15,34,35,36);
		List<String> list2=list1.stream().map(e->e+"").filter(e->e.startsWith("1")).collect(Collectors.toList());
		list2.forEach(e->System.out.println(e));
		
		System.out.println("------------------------");
		
		List<Integer> list=Arrays.asList(10,11,12,13,13,103);
		List<String> list3=list.stream().map(e->e+"").filter(e->e.startsWith("1") && e.endsWith("3")).collect(Collectors.toList());
		list3.forEach(e->System.out.println(e));
		
	}

}
