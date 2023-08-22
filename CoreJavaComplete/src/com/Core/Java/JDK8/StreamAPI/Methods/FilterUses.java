package com.Core.Java.JDK8.StreamAPI.Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterUses {
	public static void main(String[] args) {
		/*List<Integer> list=Arrays.asList(1,2,3,4,5);
		List<Integer> l=list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(l);*/
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,null,null);
		List<Integer> l=list.stream().filter(e->e!=null).collect(Collectors.toList());
		System.out.println(l);
		
		//filter is uses to filter the data from list based on the condition as you can see the example
	}

}
