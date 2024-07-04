package com.java.logical.coding.Array;

import java.util.Arrays;
import java.util.List;

public class FindMin{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,0};
		int min=0;
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(min);
		//using stream api
		int ls=Arrays.stream(arr).min().getAsInt();
		System.out.println(ls);
		
		
	}
}