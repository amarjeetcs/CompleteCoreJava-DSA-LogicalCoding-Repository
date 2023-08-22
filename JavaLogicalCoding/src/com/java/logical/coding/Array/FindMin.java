package com.java.logical.coding.Array;
/*
class FindMin
{
public static void main(String[] args)
{
int arr[]={5,4,3,2,1,6,6,7};
int min=arr[0];
for(int i=1;i<arr.length;i++)
{
if(min>arr[i])
{
min=arr[i];
}
}
System.out.println(min);
}
}
*/

class FindMin{
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("min element is: "+min);
	}
}