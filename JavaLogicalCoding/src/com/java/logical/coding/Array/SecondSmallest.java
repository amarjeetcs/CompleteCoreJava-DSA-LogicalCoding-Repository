package com.java.logical.coding.Array;
public class SecondSmallest {

	public static void main(String[] args) {
		int[] arr={6,8,2,4,3,1,5,7};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println(arr[1]);
	}

}
