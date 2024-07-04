package com.java.logical.coding.Array;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int a = 10;  //a=20
		int b = 20;  //b=10

		System.out.println("before swapping a=" + a);
		System.out.println("before swapping b=" + b);
		
		System.out.println("-------------------------------");
		
		a=a+b;  
		b=a-b;
		a=a-b;  
		  
		
		System.out.println("after swapping a="+a);
		System.out.println("after swapping b="+b);
	}

}
