package com.java.logical.jdk8.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class findMaxNumberInList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,53,56,76,88,83);
		Optional<Integer> max=list.stream().max(Integer::compareTo);
		max.ifPresent(MaxValue->System.out.println(MaxValue));
	}

}
