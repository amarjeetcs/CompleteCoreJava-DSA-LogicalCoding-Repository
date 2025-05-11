package com.Core.Java.OPPS.Constructor;

public class DefaultConstructor {

	int i; //0
	String str;//null
	boolean b;//false
	
	
	public static void main(String[] args) {
		DefaultConstructor d=new DefaultConstructor();
		System.out.println(d.i);
		System.out.println(d.str);
		System.out.println(d.b);
	}

}
//in this program we are not initializing the value of i and str but you can see output
//given 0 and null how this is possible because default constructor initialize the 
//default value of int is 0 and default value of string is null.
//if we are not creating constructor in program then it is compiler responsiblity
//to automatically create default constructor 