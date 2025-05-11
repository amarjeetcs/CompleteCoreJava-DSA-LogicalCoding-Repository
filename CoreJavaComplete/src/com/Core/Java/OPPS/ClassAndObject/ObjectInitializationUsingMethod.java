package com.Core.Java.OPPS.ClassAndObject;

public class ObjectInitializationUsingMethod {
	int id;
	String name;
	String city;
	String state;

	void insertRecord(int id, String name, String city, String state) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
	}

	public static void main(String[] args) {
		ObjectInitializationUsingMethod o = new ObjectInitializationUsingMethod();
		o.insertRecord(101, "Amarjeet", "Bangalore", "Karnatka");
		System.out.println(o.id + " " + o.name + " " + o.city + " " + o.state);
	}
//Initialization Methods: Offer flexibility but require additional method calls, 
	// which can be error-prone.
}
