package com.Core.Java.ExceptionHandling;

public class ArithmaticExceptoin {
	public static void main(String[] args) {
		/*int x=100;
		int y=0;  //without try catch will give error arithmatic exception
		int z=x/y;
		System.out.println(z);*/
		
		try {
			int x=100;
			int y=0;   //exception handelled using try catch 
			int z=x/y;
			System.out.println(z);
		}catch (ArithmeticException e) {
			System.out.println("You can not divide by Zero");
		}
		System.out.println("rest of the code");
		System.out.println("rest of the code");
		System.out.println("rest of the code");
		System.out.println("rest of the code");
		System.out.println("rest of the code");
		System.out.println("rest of the code");
		System.out.println("rest of the code");
		System.out.println("rest of the code");
		System.out.println("rest of the code");
		
		
	}
}
//null pinter expetion
//number format exception
//arithmatic exception these are all unchecked/runtime exception