package com.Core.Java.JDK8.StreamAPI.Methods;
import java.util.*;
import java.util.stream.Collectors;

public class SortedUses {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,4,3,2,1);
		Optional<Integer> ls=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("Second largest using java8: "+ls.get());
		
	}

}
