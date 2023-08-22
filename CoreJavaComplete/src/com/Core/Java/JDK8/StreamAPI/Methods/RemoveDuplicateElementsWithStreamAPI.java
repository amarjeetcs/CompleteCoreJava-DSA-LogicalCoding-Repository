package com.Core.Java.JDK8.StreamAPI.Methods;
import java.util.*;
public class RemoveDuplicateElementsWithStreamAPI {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("D");
		
		
		al.stream().distinct().forEach(x->System.out.println(x));
	}
}
