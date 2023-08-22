package com.DSA.Recursion;


public class NumberPrintWithoutRecursion {
	//print first 5 number like 1,2,3,4,5 just taking input 5
	//Note:- 1. while the function not is not finished executing it will remain in stack
			//-->main function will go first to the stack and come out from stack at last
	public static void main(String[] args) {
		print1(1);
	}

	 static void print1(int n) {
		System.out.println(n);
		print2(2);

	}

	 static void print2(int n) {
		System.err.println(n);
		print3(3);
	}

	 static void print3(int n) {
		System.out.println(n);
		print4(4);
	}

	 static void print4(int n) {
		System.out.println(n);
		print5(5);
	}

	 static void print5(int n) {
		System.out.println(n);

	}

}
