package com.Core.Java.OPPS.Polymorphism;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

public class HelloWorld {
	public void run() {

		System.out.println("I am running");
	}
}

class B extends HelloWorld {
	public void run() {

		System.out.println("I am running");
	}
}

class Test {
	public static void main(String[] args) {
		B b = new B();
		b.run();
	}
}