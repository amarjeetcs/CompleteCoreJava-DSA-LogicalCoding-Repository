package com.java.logical.jdk8.coding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintDuplicateUsingStramApi {
	public static void main(String[] args) {
		
		// print duplicate element from the list in java8 first way
		List<Integer> duplicates = IntStream.of(1, 2, 3, 2, 1, 2, 3, 4, 2, 2, 2).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(p -> p.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(duplicates);
		
		// print duplicate element from the list in java8 second way
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);
		Set<Integer> dup = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
		System.out.println(dup);
	}
}