package com.Core.Java.JDK8.LamdaAndFunctionalInterface;

@FunctionalInterface
interface Add {
	public void add(int a, int b);
}

public class AddTwoNumber {
	public static void main(String[] args) {

		Add obj = (a, b) -> System.out.println("Sum of two number is:" + (a + b));
		obj.add(10, 20);
	}
}

