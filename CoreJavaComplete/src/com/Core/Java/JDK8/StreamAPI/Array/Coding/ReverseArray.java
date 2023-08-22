package com.Core.Java.JDK8.StreamAPI.Array.Coding;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseArray {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		List<Integer> ls=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(ls);
	}

}
