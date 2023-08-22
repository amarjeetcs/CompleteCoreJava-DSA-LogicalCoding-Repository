package com.Core.Java.OPPS.ClassAndObject;

public class ClassAndObject {
	int id;
	String name;
	String city;
	String state;
	
	public void run()
	{
		System.out.println("I am running");
	}
	
	public void eat()
	{
		System.out.println("I am eating");
	}
	
	public static void main(String[] args) {
		ClassAndObject c=new ClassAndObject();
		c.run();
		c.eat();
	}
	
	//in this program we have created one class and define data member and member function
	//we are calling member function with the help of c object.
	//if I want to initialize the object c or want to insert data into it inside the data member then how it is possible.
	//so for that we need to initialize the object.
	//To initialization of object in java using reference variable, method, constructor
	//so in difference different program we will see the example
}
