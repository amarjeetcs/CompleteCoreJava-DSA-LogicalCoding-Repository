package com.java.logical.coding.Array;
public class OddEvenInArray {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	int even=0;
	int odd=0;
	System.out.println("Even Numbers");
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			even++;
			System.out.println(arr[i]);
		}
	}
	System.out.println("Odd Numbers");
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2!=0)
		{
			odd++;
			System.out.println(arr[i]);
		}
	}
	System.out.println("Total number of even numbers="+even);
	System.out.println("Total number of odd numbers="+odd);
}
}
