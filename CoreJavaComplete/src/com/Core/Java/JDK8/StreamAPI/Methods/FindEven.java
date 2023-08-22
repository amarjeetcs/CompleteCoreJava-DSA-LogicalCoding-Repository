package com.Core.Java.JDK8.StreamAPI.Methods;

import java.util.Arrays;

public class FindEven {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		Arrays.stream(arr).filter(e->e%2==0).forEach(e->System.out.println(e));
	}

}
