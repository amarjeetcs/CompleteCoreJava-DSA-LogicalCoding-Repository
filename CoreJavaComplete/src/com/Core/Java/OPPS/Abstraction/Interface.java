package com.Core.Java.OPPS.Abstraction;
/*interface Interface
{
	void A1();
	void A2();
	void A3();
	
	static void m1()
	{
		System.out.println("i am static mehtod");
	}
	
	final int x=10;
	static int y=20;
	int z=30;
}
class Amarjeet implements Interface
{
	public void A1()
	{
		System.out.println("I am A1 interface");
	}
	
	public void A2()
	{
		System.out.println("I am A2 interface");
	}
	public void A3()
	{
		System.out.println("I am A3 interface");
	}
	
	static void m2()
	{
		System.out.println("i am static method 2");
	}
	public static void main(String[] args) {
		Amarjeet a=new Amarjeet();
		a.A1();
		a.A2();
		a.A3();
		Interface.m1();
		System.out.println(Interface.x);
		System.out.println(Interface.y);
		System.out.println(z);
	}
}*/

interface InterfaceDemo {
	abstract void m1();

	public void m2();

	default void default_method() {
		System.out.println("Default method");
	}

	static void static_method() {
		System.out.println("This is static method...");
	}
	
	

}

class B implements InterfaceDemo {
	public void m1() {
		System.out.println("calling m1() of interface...");
	}
	

	public void m2() {
		System.out.println("calling m2() of interface...");
	}

	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
		InterfaceDemo.static_method();
	}
}
