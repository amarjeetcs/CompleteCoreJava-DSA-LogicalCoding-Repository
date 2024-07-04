package com.java.logical.coding.Array;
public class FindMissingElements{
	public static void main(String[] args) {
		int[] arr= {1,2,4,5,7,11};
		int n=arr.length+5;
		
		int NaturalSum=n*(n+1)/2;
		System.out.println(NaturalSum);
		
		//sum of the element in array
		int ArraySum=0;
		for(int i=0;i<arr.length;i++)
		{
			ArraySum=ArraySum+arr[i];
		}
		System.out.println(ArraySum);
		
		int missingElement=NaturalSum-ArraySum;
		System.out.println("missingElement= " +missingElement);
	}
}