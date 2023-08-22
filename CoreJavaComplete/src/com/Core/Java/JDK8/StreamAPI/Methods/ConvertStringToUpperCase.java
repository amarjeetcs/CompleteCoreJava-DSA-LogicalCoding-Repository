package com.Core.Java.JDK8.StreamAPI.Methods;

import java.util.*;

public class ConvertStringToUpperCase {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("->a");
		al.add("->a");
		al.add("B");
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add(null);
		al.add(null);

		al.stream().distinct().filter(x -> x != null).map(y -> y.toUpperCase()).sorted()
				.forEach(f -> System.out.println(f));

	}

}
