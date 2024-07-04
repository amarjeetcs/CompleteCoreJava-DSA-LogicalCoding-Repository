package com.java.logical.coding.Array;

import java.util.ArrayList;
import java.util.List;

public class FindMultipleMissingElement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 8, 10 };

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < arr.length-1; i++)
		{
			int current = arr[i];
			int next = arr[i + 1];
			
			if(next-current>1)
			{
				for(int j=current+1;j<next;j++)
				{
					al.add(j);
				}
			}
		}
		System.out.println(al);
	}
}
