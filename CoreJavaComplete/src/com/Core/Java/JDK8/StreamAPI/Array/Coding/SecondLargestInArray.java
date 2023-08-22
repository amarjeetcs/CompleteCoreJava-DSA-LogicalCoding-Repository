package com.Core.Java.JDK8.StreamAPI.Array.Coding;
import java.util.*;
import java.util.stream.Collectors;

public class SecondLargestInArray {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,2,1,4,5);
		Optional<Integer> ls=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(ls.get());
		
	}
}
