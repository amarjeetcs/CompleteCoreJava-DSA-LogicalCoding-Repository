package com.Core.Java.OPPS.Abstraction;
/*
 * abstract class AbstractClass { abstract void A1(); abstract void A2();
 * abstract void A3(); final void showFinal() {
 * System.out.println("I am final method.."); } AbstractClass() {
 * System.out.println("I am constructor..."); } static void display2() {
 * System.out.println("i am static method"); }
 * 
 * }
 * 
 * class Amar extends AbstractClass { void A1() {
 * System.out.println("abstract class"+"A1"); }
 * 
 * void A2() { System.out.println("abstract class"+"A2"); }
 * 
 * void A3() { System.out.println("abstract class"+"A3"); }
 * 
 * void display() { System.out.println("i am non abstract method"); } }
 * 
 * class Test { public static void main(String[] args) {
 * 
 * Amar a=new Amar(); a.A1(); a.A2(); a.A3(); a.display(); a.showFinal();
 * AbstractClass.display2();
 * 
 * 
 * } }
 */

public abstract class AbstractClass {
	static int x = 10; //static variable
	final int y = 20;  //final variable

	abstract void run1();  //abstract method

	void run2() {   //Non-abstract method
		System.out.println("non abstract method..");
	}

	AbstractClass() {  //constructor
		System.out.println("this is constructor...");
	}

	{   //block
		System.out.println("this is block");
	}
	static {  //static block
		System.out.println("this is static block");
	}

	static void static_method() {  //static method
		System.out.println("this is static method");
	}

	final void final_method() {  //final method
		System.out.println("this is final method");
	}

}
class Amarjeet1 extends AbstractClass{

	@Override
	void run1() {
		System.out.println("this is abstract method");
	}
	
	public static void main(String[] args) {
		Amarjeet1 am=new Amarjeet1();
		System.out.println(am.y);
		System.out.println(AbstractClass.x);
		am.final_method();
		am.run2();
		am.run1();
		AbstractClass.static_method();
	}
}


//abstract class can have abstract method
//abstract class can have non-abstract method
//abstract class can have constructor
//abstract class can have static method
//abstract class can have final method
//abstract class can have concreate method
