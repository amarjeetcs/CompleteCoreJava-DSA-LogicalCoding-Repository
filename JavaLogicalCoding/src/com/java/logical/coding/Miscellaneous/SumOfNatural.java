package com.java.logical.coding.Miscellaneous;

import java.util.Scanner;
public class SumOfNatural {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the natural number");
	int n=sc.nextInt();

	/*int sum=n*(n+1)/2;
	System.out.println(sum);
	*/
	int total=0;
	for(int i=0;i<=n;i++)
	{
		total=total+i;
	}
	System.out.println("total is:"+total);

	sc.close();

	}

}
