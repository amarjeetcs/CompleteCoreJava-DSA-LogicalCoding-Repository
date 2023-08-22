package com.java.logical.coding.StreamAPI.Advance;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class GroupWordByLength {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("mango", "banana", "coconut", "orange");
		Map<Integer, List<String>> map = list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map);
	}

}
