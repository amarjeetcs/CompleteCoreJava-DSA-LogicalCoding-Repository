package com.java.logical.jdk8.coding;

import java.util.Arrays;
import java.util.List;

public class SorfUsnigMehtodReference {
	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(1,4,5,7,3,4);
		ls.sort(Integer::compareTo);
		System.out.println(ls);
		
	}

}
