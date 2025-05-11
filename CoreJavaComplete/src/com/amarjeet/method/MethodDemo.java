package com.amarjeet.method;

import java.util.Scanner;

public class MethodDemo {
	
	public static int show(int x,int b)
	{
		int sum=x+b;
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please eneter first number");
		int a=sc.nextInt();
		
		System.out.println("please eneter second number");
		int b=sc.nextInt();
		
		int s=show(a,b);

		int s1=show(a,b);
		int s2=show(a,b);
		int s3=show(a,b);
		int s4=show(a,b);
		int s5=show(a,b);
		System.out.println("total sum: "+s);

		System.out.println("total sum: "+s1);
		System.out.println("total sum: "+s2);
		System.out.println("total sum: "+s3);
		System.out.println("total sum: "+s4);
		System.out.println("total sum: "+s5);
		
		
		
	}

}
