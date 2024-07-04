package com.java.logical.jdk8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> lsit=Arrays.asList(1,2,2,3,4,4,5,5);
		List<Integer> list=lsit.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
	}

}
