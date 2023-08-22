package com.Core.Java.JDK8.MehodReferenceOrConstructorReference;

//Type of method reference
//1.Reference to static method
//2.Reference to instance method
//3.Reference to constructor
//:: operator is used to accecss 

interface Sayable {
	void say();
}

public class MethodReference {
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {
		// Referring static method
		Sayable sayable = MethodReference::saySomething;
		// Calling interface method
		sayable.say();
	}
}
