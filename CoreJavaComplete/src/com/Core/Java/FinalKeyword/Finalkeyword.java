package com.Core.Java.FinalKeyword;

class Finalkeyword {
	public void m1(int a) {
		System.out.println("inside the parent class...");
	}
}
//final use to restrict the user to dont override the method and class and dont change the value of the variable
class B extends Finalkeyword {
	public void m1(int a) {
		super.m1(10);
		System.out.println("inside the child class...");
	}

	public static void main(String[] args) {
		int i = 10;
		i = i + 20;
		System.out.println(i);
		B b = new B();
		b.m1(1);
	}
}
