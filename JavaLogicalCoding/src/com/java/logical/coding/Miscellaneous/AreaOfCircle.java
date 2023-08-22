package com.java.logical.coding.Miscellaneous;

import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int r=sc.nextInt();
	float pi=3.14159f;
	
	if(r>=20 && r<=30)
	{
	float total=pi*r*r;
	System.out.println(total);
	}
	else
	{
		System.out.println("invalid input");
	}
	
	}

}
