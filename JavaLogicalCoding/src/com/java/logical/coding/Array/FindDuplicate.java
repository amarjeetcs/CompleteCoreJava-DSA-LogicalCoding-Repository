package com.java.logical.coding.Array;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {
	public static void main(String[] args) {
//		int[] arr= {1,1,2,3,4,5,5,9,9,10};
//		List<Integer> al=new ArrayList<Integer>();
//	
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					System.out.println(arr[j]);
//				}
//			}
//		}
//		

		int[] arr = { 1, 2, 2, 3, 4, 5, 5, 6, 7 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
//					list.add(arr[i]);
					System.out.println(arr[i]);
				}
			}
		}
		
		System.out.println(list);
		int[] arr1 = { 1, 2, 2, 3, 4, 5, 5, 6, 7 };
		List<Integer> list1 = Arrays.stream(arr1).boxed().toList();
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> s= list1.stream().filter(e -> !set.add(e)).collect(Collectors.toSet());
		System.out.println(s);

	}
}
