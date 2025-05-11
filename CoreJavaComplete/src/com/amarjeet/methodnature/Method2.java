package com.amarjeet.methodnature;

import java.util.Scanner;

public class Method2 {

	public static void sum(int x, int y) {
		int total = x + y;
		System.out.println("total sum is: " + total);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = sc.nextInt();

		System.out.println("Enter second number");
		int y = sc.nextInt();

		sum(x, y);

	}

}
