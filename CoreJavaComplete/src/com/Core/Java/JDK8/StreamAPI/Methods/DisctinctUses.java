package com.Core.Java.JDK8.StreamAPI.Methods;
import java.util.*;
import java.util.stream.Collectors;
public class DisctinctUses {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(null);
		al.add(5);
		al.add(3);
		al.add(1);
		al.add(null);
		al.add(null);
		
		List<Integer> list=al.stream().distinct().filter(e->e!=null).collect(Collectors.toList());
		System.out.println(list);//[1, 2, 3, 4, 5] null and disctinct is hidden from this list
	}

}
