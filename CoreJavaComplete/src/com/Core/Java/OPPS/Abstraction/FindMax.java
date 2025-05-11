package com.Core.Java.OPPS.Abstraction;

public class FindMax {
	public static void main(String[] args) {
		int arr[]= {10,20,50,60,10};
	    int temp;
		for(int i=arr.length-2;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		
		}
		for(int a:arr)
		{
			System.out.print(" "+a);
		}
		
	}
	
	

}
