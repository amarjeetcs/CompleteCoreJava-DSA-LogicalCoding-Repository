package com.java.logical.coding.StreamAPI.Advance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateInList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,5,4,3);
		List<Integer> result=list.stream().distinct().collect(Collectors.toList());
		System.out.println(result);
	}

}
