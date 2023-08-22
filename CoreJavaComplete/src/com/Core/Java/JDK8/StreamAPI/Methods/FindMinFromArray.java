package com.Core.Java.JDK8.StreamAPI.Methods;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindMinFromArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		OptionalInt min=Arrays.stream(arr).min();
		System.out.println(min.getAsInt());
	}

}
