package com.java.logical.coding.Array;
public class SecondLargest {

	public static void main(String[] args) {
		int[] arr= {6,8,2,4,3,1,5,7,7,4,8,9,9};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
				   temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("second largest element is: "+arr[2]);
	
		
	}
}

