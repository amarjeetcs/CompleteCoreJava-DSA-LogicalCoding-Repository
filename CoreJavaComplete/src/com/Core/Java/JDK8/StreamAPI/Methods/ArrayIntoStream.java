package com.Core.Java.JDK8.StreamAPI.Methods;

import java.util.Arrays;

public class ArrayIntoStream {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		// System.out.println(arr.length);
		long count = Arrays.stream(arr).count();// converting array into stream
		System.out.println(count);
		Arrays.stream(arr).forEach(e -> System.out.println("printing element: "+e));
	}
}
