package com.Core.Java.WrapperClasses;

public class WrapperClass {
	
	public static void main(String[] args) {
		Integer i = 10;
		int i1 = i;
		
		double d=(double)i;
		
		char c='a';
		Character ch=c;
		System.out.println(ch.getClass());
		
		//System.out.println(d);
		// Checking the wrapper class
		//System.out.println("Wrapper class: " + i.getClass().getName());

	}
}
