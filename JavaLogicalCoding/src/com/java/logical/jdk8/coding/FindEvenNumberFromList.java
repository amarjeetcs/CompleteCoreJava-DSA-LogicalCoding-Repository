package com.java.logical.jdk8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumberFromList {
	public static void main(String[] args) {
		List<Integer> i=Arrays.asList(1,2,3,4,5,11,13,17);
		List<Integer> i1=i.stream().filter(e->e%2==0).collect(Collectors.toList());
		
		
	}
	
	

}
