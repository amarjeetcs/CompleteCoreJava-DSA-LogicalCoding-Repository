package com.Core.Java.JDK8.StreamAPI.Methods;

import java.util.Arrays;

public class ArraySum {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
//		int sum=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			sum=sum+arr[i];
//		}
//		System.out.println(sum);
		
		int sum=Arrays.stream(arr).sum();
		System.out.println(sum); //using stream api
	}

}
