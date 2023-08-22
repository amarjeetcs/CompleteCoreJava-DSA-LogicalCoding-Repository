package com.Core.Java.JDK8.StreamAPI.Array.Coding;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SecondSmallest {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,4,3,5);
		List<Integer> ls=list.stream().sorted().collect(Collectors.toList());
		System.out.println(ls.stream().skip(1).findFirst().get());
		
		
	}

}
