package com.Core.Java.OPPS.Polymorphism;

public class Overloading {
	/*
	 * void show1(int a,String s) { System.out.println("i am int and string"); }
	 * 
	 * 
	 * void show1(String s,int a) { System.out.println("i am string and int"); }
	 * 
	 * void show1() { System.out.println("i am empty"); }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * Overloading o=new Overloading(); o.show1(10,"nikki"); o.show1("nikki",10);
	 * o.show1(); }
	 */

	// method with same name with different parameter(number of parameter could be
	// different, type of parameter, sequence of parameter)
	// into single class called method overloading
	public void run() {
		System.out.println("calling run no parameter...");
	}

	public void run(String str, int b) {
		System.out.println("calling run with one int parameter...");
	}


	public void run(int a, String b) {
		System.out.println("callling run with int and string parameter...");
	}

	// can we overload static method in java answer will yes we can overload
	public static void main(String[] args) {
		Overloading m = new Overloading();
		m.run();

	}

}
