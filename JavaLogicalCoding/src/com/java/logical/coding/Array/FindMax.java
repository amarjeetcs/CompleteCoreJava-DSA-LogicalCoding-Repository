package com.java.logical.coding.Array;
/*
public class FindMax {
	public static void main(String[] args) {
		int[] arr= {40,30,11,12,33,70,70,65};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("Largest Element in array is: "+max);
	}
}

*/

class FindMax
{
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}