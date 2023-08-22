package com.java.logical.coding.StreamAPI.Advance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinWordsInList {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Hello"," ","World","!");
		String result=list.stream().collect(Collectors.joining());
		System.out.println(result);
	}

}
