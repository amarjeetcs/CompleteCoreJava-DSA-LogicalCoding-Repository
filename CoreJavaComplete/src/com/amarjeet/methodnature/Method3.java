package com.amarjeet.methodnature;

import java.util.Scanner;

public class Method3 {

	public static int sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = sc.nextInt();

		System.out.println("Enter second number");
		int y = sc.nextInt();
		return x+y;
	}

	public static void main(String[] args) {
		int totalSum = sum();
		System.out.println(totalSum);
	}

}
