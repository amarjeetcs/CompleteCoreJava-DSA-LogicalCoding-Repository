package com.Core.Java.JDK8.StreamAPI.Methods;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] arr= {1,3,4,6,7,5,2};
//		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
//		
		Arrays.stream(arr).sorted().forEach(e->System.out.println(e)); //using stream api
	}

}
