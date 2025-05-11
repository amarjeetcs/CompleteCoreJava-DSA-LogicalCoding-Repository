package com.amarjeet.methodnature;

import java.util.Scanner;

public class Method4 {

	public static void sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = sc.nextInt();

		System.out.println("Enter second number");
		int y = sc.nextInt();

		int totalSum = x + y;
		System.out.println(totalSum);
	}

	public static void main(String[] args) {
		sum();
		
	}

}
