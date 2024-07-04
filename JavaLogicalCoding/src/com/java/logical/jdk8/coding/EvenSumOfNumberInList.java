package com.java.logical.jdk8.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenSumOfNumberInList {
	public static void main(String[] args) {

		// below is three way to perform sum of element in java8
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		
		Integer sum = al.stream().filter(e -> e % 2 == 0).reduce(0, Integer::sum);
		System.out.println(sum);

		// second way
		Integer sumValue = al.stream().filter(e -> e % 2 == 0).reduce(0, (a, b) -> a + b);
		System.out.println(sumValue);

		// third way
		Integer sum1 = al.stream().filter(e -> e % 2 == 0).mapToInt(e -> e).sum();
		System.out.println(sum1);
		
		
		
		
		
		

	}

}
