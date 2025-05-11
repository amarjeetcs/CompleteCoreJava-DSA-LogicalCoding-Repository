package com.amarjeet.methodnature;

import java.util.Scanner;

public class Method1 {

	public static int sum(int x, int y) {
		int total = x + y;
		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = sc.nextInt();

		System.out.println("Enter second number");
		int y = sc.nextInt();

		int totalSum = sum(x, y);
		int totalSum1 = sum(x, y);
		int totalSum2 = sum(x, y);
		int totalSum3 = sum(x, y);
		System.out.println("total sum is:" + totalSum);
		System.out.println("total sum is:" + totalSum1);
		System.out.println("total sum is:" + totalSum2);
		System.out.println("total sum is:" + totalSum3);

	}

}
