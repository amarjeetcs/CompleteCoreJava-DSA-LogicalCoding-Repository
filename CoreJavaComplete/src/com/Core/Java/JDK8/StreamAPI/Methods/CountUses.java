package com.Core.Java.JDK8.StreamAPI.Methods;
import java.util.*;


public class CountUses {
	public static void main(String[] args) {
		List<String> str=Arrays.asList("apple","banana","pineapple","mango");
		long list=str.stream().count();
		System.out.println(list);
	}

}
