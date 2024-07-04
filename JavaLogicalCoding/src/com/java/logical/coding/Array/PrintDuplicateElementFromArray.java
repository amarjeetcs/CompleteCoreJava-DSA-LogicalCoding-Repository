package com.java.logical.coding.Array;

import java.util.HashSet;
import java.util.Set;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateElementFromArray {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 4, 5 };

		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (int num : arr) {
			if (!seen.add(num)) {
				duplicates.add(num);
			}
		}
		System.out.println("The duplicate elements are: " + duplicates);
	}
}
