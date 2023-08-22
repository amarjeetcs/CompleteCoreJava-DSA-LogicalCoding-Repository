package com.Core.Java.SuperKeyword;


public class Superkeyword {
	int i=10;
	public void m1()
	{
	System.out.println("calling parent class method...");
	}
}
class B extends Superkeyword{
	
	public void m2()
	{
	super.m1();
	}
	int i=20;
	void show(int i)
	{
		System.out.println("Calling parent class variable: "+super.i);
		System.out.println("Class B variable: "+i);
	}
	public static void main(String[] args) {
		B b=new B();
		b.show(30);
		b.m2();
	}
}
