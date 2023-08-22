package com.Core.Java.JDK8.StreamAPI.Methods;

import java.util.*;
import java.util.stream.Collectors;

public class StringLowerCase {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("C");
		al.add("B");
		al.add("D");
		al.add("A");
		al.stream().distinct().map(e -> e.toLowerCase()).sorted().forEach(e -> System.out.println(e));
		System.out.println("---------------------------------------");
		ArrayList a=new ArrayList<>();
		a.add(1);
		a.add(0);
		a.add(44);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.stream().limit(5).distinct().sorted().forEach(e->System.out.println(e));
		System.out.println("---------------------------------------");
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("A");
		al1.add("C");
		al1.add("B");
		al1.add("D");
		al1.add("A");
		al1.add("A");
		al1.stream().skip(2).sorted().distinct().forEach(e->System.out.println(e));
		System.out.println("---------------------------------------");
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(1);
		al2.add(2);
		al2.add(2);
		al2.add(3);
		al2.add(4);
		al2.add(5);
		List<Integer> list=al2.stream().collect(Collectors.toList());
		System.out.println("List of collection: "+list);
		
	}

}
