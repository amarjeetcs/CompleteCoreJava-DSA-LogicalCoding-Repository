package com.java.logical.coding.Miscellaneous;

public class PrintNumbersWithoutLoop {
	public static void main(String[] args) {
		print(1);
	}
	public static void print(int n)
	{
		if(n<=100)
		{
			System.out.println(n);
			print(n+1);
		}
	}

}
