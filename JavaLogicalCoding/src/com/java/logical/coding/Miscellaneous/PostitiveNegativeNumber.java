package com.java.logical.coding.Miscellaneous;

import java.util.Scanner;
public class PostitiveNegativeNumber
{
	public static void main(String[] args)
	{
		//scanner class declaration
		
		Scanner sc = new Scanner(System.in);
		//input from the user
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		//condition for positive
		if(num==0)
			System.out.println("number is zero"+num);
		//condition for negative
		else if(num<0)
			System.out.println("Negative"+num);
		else if(num>0)
			System.out.println("number is positive"+num);
		//closing scanner class(not compulsory, but good practice)
		sc.close();
	}
}