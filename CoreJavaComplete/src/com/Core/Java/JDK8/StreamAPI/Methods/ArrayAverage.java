package com.Core.Java.JDK8.StreamAPI.Methods;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArrayAverage {
	public static void main(String[] args) {
		int[] arr= {10,30,20};
		OptionalDouble avg=Arrays.stream(arr).average();
		System.out.println(avg.getAsDouble());
	}
}
