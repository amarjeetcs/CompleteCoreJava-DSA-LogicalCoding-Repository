package com.Core.Java.OPPS.Polymorphism;

public class Overriding {

	void show(int x, String s) {
		System.out.println("i am amarjeet");
	}

}
class Xyz extends Overriding {
	void show(int x, String s) {
		System.out.println("i am in extended method");
	}
	public static void main(String[] args) {

//		Overriding t = new Overriding();
//		t.show(10, "amarjeet");

		Xyz x = new Xyz();
		x.show(10, "amarjeet");

	}
}

//	public static void sleep1() {
//		System.out.println("i am sleeping...");// static is not overridden but method hiding is done in this code
//	}
//
//	public void run() {
//		System.out.println("I am run");
//	}
//
//	public void run(int a, int b) {
//		System.out.println("I am run with two int parameter1...");
//	}
//}
//
//class M1 extends Overriding {
//	public static void sleep1() {
//		System.out.println("i am sleeping overrideen...");
//	}
//
//	public void run() {
//		super.run(10, 20);
//		System.out.println("I am run overridden...");
//	}
//
//	public void run(int a, int b) {
//		System.out.println("I am run with two int parameter2...");
//	}
//
//	public static void main(String[] args) {
//		Overriding m = new M1();
//		m.run();
//		m.run(1, 3);
//		m.sleep1();
//
//	}
//}
