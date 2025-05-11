package com.Core.Java.JDK8.LamdaAndFunctionalInterface;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseElement {
	public static void main(String[] args) {
		List<String> str = List.of("amarjeet", "sanjeet", "shubham", "ram", "ankit");
		List<String> reverseInDes = str.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseInDes);
	}

}
