package com.Core.Java.JDK8.StreamAPI.Array.Coding;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FindEvenOdd {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		List<Integer> ls1=list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println("Even number is: "+ls1);
		
		List<Integer> ls2=list.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println("odd number is: "+ls2);
		
		
	}
}
