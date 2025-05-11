package com.Core.Java.ExceptionHandling;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;;





















public class ArithmaticExceptoin {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		
		/*
		 * int x=100; int y=0; //without try catch will give error arithmatic exception
		 * int z=x/y; System.out.println(z);
		 */
		try {
			int x = 100;
			int y = 0;

			int z = x / y;
			System.out.println(z);
		}finally {
			System.out.println("i will always execute");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		System.out.println("rest of the code");
//		System.out.println("rest of the code");
//		System.out.println("rest of the code");
//		System.out.println("rest of the code");
//		System.out.println("rest of the code");
//		System.out.println("rest of the code");
//		System.out.println("rest of the code");
//		System.out.println("rest of the code");
//		System.out.println("rest of the code");

	}
}
//null pinter expetion
//number format exception
//arithmatic exception these are all unchecked/runtime exception