package com.Core.Java.JDK8.StreamAPI.Array.Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,1,2,2,3,3,4,4,5,5);
		List<Integer> ls=list.stream().distinct().collect(Collectors.toList());
		System.out.println(ls);
		
	}

}
