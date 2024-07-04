package com.java.logical.coding.Array;

import java.util.Arrays;
import java.util.List;

public class FindMax {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 5, 22 };
		/*
		 * int max=0; for(int i=0;i<arr.length;i++) { if(max<arr[i]) { max=arr[i]; } }
		 * System.out.println(max);
		 */

		int max = Arrays.stream(arr).max().getAsInt();
		int max1 = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}
}
