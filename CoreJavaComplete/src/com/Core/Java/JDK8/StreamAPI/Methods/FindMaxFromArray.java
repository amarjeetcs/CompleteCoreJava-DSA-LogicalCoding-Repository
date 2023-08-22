package com.Core.Java.JDK8.StreamAPI.Methods;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindMaxFromArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		OptionalInt max=Arrays.stream(arr).max();
		System.out.println(max.getAsInt());
	}

}
