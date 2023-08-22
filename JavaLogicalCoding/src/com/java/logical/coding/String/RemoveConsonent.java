package com.java.logical.coding.String;
public class RemoveConsonent {
	
	static void strorElast(int arr[],int len)
	{
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
				while (count < len)
			        arr[count++] = 0;
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr= {1, 8, 0, 2, 0,1,13,0};
		int len=arr.length;
		
		
		strorElast(arr,len);
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}
	}

}

