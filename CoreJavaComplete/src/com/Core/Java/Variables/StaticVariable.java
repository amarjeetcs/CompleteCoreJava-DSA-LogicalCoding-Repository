package com.Core.Java.Variables;

public class StaticVariable {
	//static variable->created inside the class with the help of static keyword and outside the main method.
	//static variable is also called class level varible
	static String str="sunny";
	public static void main(String[] args) {
		//how to access static variable
		System.out.println("directly: "+str);//directly
		System.out.println("with the help of class name: "+StaticVariable.str);//better way to call static varible in java with the help of class name
		StaticVariable s=new StaticVariable();
		System.out.println("with the help of object: "+s.str);
		
	}

}
