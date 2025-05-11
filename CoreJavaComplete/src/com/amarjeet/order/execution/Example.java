package com.amarjeet.order.execution;


public class Example {
	// Static variable
	static int staticVar = 10;

	// Static block
	static {
		System.out.println("Static block executed");
		staticVar = 20;
	}

	// Instance variable
	int instanceVar = 30;

	// Instance block
	{
		System.out.println("Instance block executed");
		instanceVar = 40;
	}

	// Constructor
	Example() {
		System.out.println("Constructor executed");
		instanceVar = 50;
	}

	// Static method
	static void staticMethod() {
		System.out.println("Static method executed");
		System.out.println("Static variable: " + staticVar);
	}

	// Instance method
	void instanceMethod() {
		System.out.println("Instance method executed");
		System.out.println("Instance variable: " + instanceVar);
	}

	public static void main(String[] args) {
		// Calling static method without creating an object
		Example.staticMethod();

		// Creating an object
		Example obj = new Example();
		obj.instanceMethod();
	}
}
//can we write static block inside the main method : no we can not write
