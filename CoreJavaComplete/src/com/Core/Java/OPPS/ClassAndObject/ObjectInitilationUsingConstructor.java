package com.Core.Java.OPPS.ClassAndObject;

public class ObjectInitilationUsingConstructor {
	int id;
	String name;
	public ObjectInitilationUsingConstructor(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		ObjectInitilationUsingConstructor o=new ObjectInitilationUsingConstructor(101, "Amarjeet");
		System.out.println(o.id+" "+o.name);
	}

}
