package com.Core.Java.Object.Class.Methods;

public class ObjectClassMethods {
	int id;
	String name;
	int age;
	
	ObjectClassMethods(int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public static void main(String[] args) {
		ObjectClassMethods obj=new ObjectClassMethods(101,"Amarjeet",25);
		System.out.println(obj.id);
	}

}
