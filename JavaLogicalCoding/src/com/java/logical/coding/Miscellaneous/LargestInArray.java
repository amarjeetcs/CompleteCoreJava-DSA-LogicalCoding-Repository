package com.java.logical.coding.Miscellaneous;

public class LargestInArray {

	public static void main(String[] args) {
		int arr[]= {70,80,70,70,23};
		
		int max=arr[0];//10
		
		for(int i=1;i<5;i++)
		{
			if(max<arr[i])//10<60
			{
			max=arr[i];
			}

				
		}
		System.out.println("Largest number is: "+max);
		
		
		
	}

}
