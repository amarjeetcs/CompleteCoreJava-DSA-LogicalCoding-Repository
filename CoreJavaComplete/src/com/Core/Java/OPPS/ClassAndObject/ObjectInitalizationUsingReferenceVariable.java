package com.Core.Java.OPPS.ClassAndObject;

public class ObjectInitalizationUsingReferenceVariable {
	int id;
	String name;
	String city;
	String state;

	public static void main(String[] args) {
		ObjectInitalizationUsingReferenceVariable o = new ObjectInitalizationUsingReferenceVariable();
		System.out.println(o);
		System.out.println(o.id);
		System.out.println(o.name);
		System.out.println(o.city);
		System.out.println(o.state);
		
		o.id=171015;
		o.name="Amarjeet";
		o.city="Bangalore";
		o.state="Karnatka";
		System.out.println(o.id+" "+o.name+" "+o.city+" "+o.state);
	}

}
