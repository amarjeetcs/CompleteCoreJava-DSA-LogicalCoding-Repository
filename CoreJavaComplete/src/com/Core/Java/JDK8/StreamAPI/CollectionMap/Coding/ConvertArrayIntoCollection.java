package com.Core.Java.JDK8.StreamAPI.CollectionMap.Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayIntoCollection {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(list.getClass());
	}

}
