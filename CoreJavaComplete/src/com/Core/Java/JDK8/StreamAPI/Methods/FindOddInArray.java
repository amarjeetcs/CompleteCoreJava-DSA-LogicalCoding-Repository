package com.Core.Java.JDK8.StreamAPI.Methods;

import java.util.Arrays;

public class FindOddInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 5, 4, 12, 11, 10 };
		Arrays.stream(arr).distinct().filter(e -> e % 2 != 0).sorted().forEach(f -> System.out.println(f));

	}

}
