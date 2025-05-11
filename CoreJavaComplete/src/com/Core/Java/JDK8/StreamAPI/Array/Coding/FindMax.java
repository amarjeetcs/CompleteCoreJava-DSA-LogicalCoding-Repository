package com.Core.Java.JDK8.StreamAPI.Array.Coding;
import java.util.*;

public class FindMax {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,2,4,3,5);
		Optional<Integer> max=list.stream().max((c1,c2)->{return c1.compareTo(c2);});
		System.out.println(max.get());
	}
}
