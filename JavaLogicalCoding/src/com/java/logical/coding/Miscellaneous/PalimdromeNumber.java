package com.java.logical.coding.Miscellaneous;

import java.util.Scanner;
public class PalimdromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rev=0;
		int org_n=n;
		while(n>0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		if(org_n==rev)
			System.out.println("palimdrome:"+rev);
		else
			System.out.println("not palimdrome:"+rev);
	}

}
}