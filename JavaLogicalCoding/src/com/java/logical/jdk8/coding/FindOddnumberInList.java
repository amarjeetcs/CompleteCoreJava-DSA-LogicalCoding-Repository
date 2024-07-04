package com.java.logical.jdk8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

public class FindOddnumberInList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream().filter(e -> e % 2 != 0).forEach(e -> System.out.println(e));
	}
}
