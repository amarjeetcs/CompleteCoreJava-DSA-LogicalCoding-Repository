package com.Core.Java.OPPS.ClassAndObject;

public class ObjectInitializationUsingMethod {
	int id;
	String name;
	String city;
	String state;

	void insertRecord(int id1, String name1, String city1, String state1) {
		id = id1;
		name = name1;
		city = city1;
		state = state1;
	}

	public static void main(String[] args) {
		ObjectInitializationUsingMethod o = new ObjectInitializationUsingMethod();
		o.insertRecord(101, "Amarjeet", "Bangalore", "Karnatka");
		System.out.println(o.id + " " + o.name + " " + o.city + " " + o.state);
	}

}
